package site.wtfu.framework.web.config;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.core.Version;
import com.fasterxml.jackson.databind.*;
import com.fasterxml.jackson.databind.module.SimpleModule;
import org.springframework.http.converter.HttpMessageConverter;
import org.springframework.http.converter.json.MappingJackson2HttpMessageConverter;
import org.springframework.web.method.support.HandlerMethodArgumentResolver;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;
import site.wtfu.framework.web.filter.TestFilter;
import site.wtfu.framework.web.interceptor.TestInterceptor;

import javax.servlet.DispatcherType;
import javax.servlet.FilterRegistration;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.EnumSet;
import java.util.List;

/**
 * Copyright 2018 ...com Inc. All Rights Reserved.
 *
 * @author: 12302
 * @Date: 2019-11-04
 * @Desc:
 */
//@Configuration
//@EnableWebMvc
public class WebConfig extends WebMvcConfigurerAdapter  {

    /*@Value("${global.equipment.camera-trigger-save-pic-path}")
    private String picPath;

    @Override
    public void addInterceptors(InterceptorRegistry registry) {

        registry.addInterceptor(new BasePathInterceptor())
                .addPathPatterns("/**")
                .excludePathPatterns("/asyncServlet")
                .excludePathPatterns("/")
                .excludePathPatterns("/admin/orderEnter/unattended")
                .excludePathPatterns("/_draft.test/*");
        super.addInterceptors(registry);
    }*/



    @Override
    public void addResourceHandlers(ResourceHandlerRegistry registry) {


        /* * 说明：增加虚拟路径(经过本人测试：在此处配置的虚拟路径，用springboot内置的tomcat时有效，
         * 用外部的tomcat也有效;所以用到外部的tomcat时不需在tomcat/config下的相应文件配置虚拟路径了,阿里云linux也没问题)*/

        String picLocation = "_base.file:" + "c";
        registry.addResourceHandler("/image/**").addResourceLocations(picLocation);
        super.addResourceHandlers(registry);
    }

    @Override
    public void configureMessageConverters(List<HttpMessageConverter<?>> converters) {
        super.configureMessageConverters(converters);
        if(1==2){
            for (HttpMessageConverter converter : converters) {
                if (converter instanceof MappingJackson2HttpMessageConverter) {
                    ObjectMapper objectMapper;
                    objectMapper = ((MappingJackson2HttpMessageConverter) converter).getObjectMapper();
                    SimpleModule module = new SimpleModule("localdateTime", Version.unknownVersion());
                    module.addSerializer(LocalDateTime.class,new LocalDateTimeSerializer());
                    module.addDeserializer(LocalDateTime.class,new LocalDateTimeDeserializer());
                    objectMapper.registerModule(module);
                }
            }
        }
    }

    @Override
    public void addArgumentResolvers(List<HandlerMethodArgumentResolver> argumentResolvers) {
        super.addArgumentResolvers(argumentResolvers);
        for (HandlerMethodArgumentResolver argumentResolver : argumentResolvers) {
            System.out.println(argumentResolver);
        }
    }


    private static class LocalDateTimeSerializer extends JsonSerializer<LocalDateTime> {

        private static final DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");

        @Override
        public void serialize(LocalDateTime value, JsonGenerator jgen, SerializerProvider provider)
                throws IOException {
            jgen.writeString(dateTimeFormatter.format(value));
        }

    }

    private static class LocalDateTimeDeserializer extends JsonDeserializer<LocalDateTime> {

        @Override
        public LocalDateTime deserialize(JsonParser jsonParser, DeserializationContext deserializationContext) throws IOException {
            String result = "";
            JsonToken curr = jsonParser.getCurrentToken();
            // Usually should just get string value:
            if (curr == JsonToken.VALUE_STRING) {
                result = jsonParser.getText();
            }
            return LocalDateTime.parse(result);
        }
    }


    /**
     * see: https://blog.csdn.net/zzuhkp/article/details/121288762/
     *      https://blog.csdn.net/qiaohao0206/article/details/125655989/
     * @param servletContext
     * @throws ServletException
     */
    //@Override
    public void onStartup(ServletContext servletContext) {
        FilterRegistration.Dynamic myFilter = servletContext.addFilter("testFilter", TestFilter.class);
        myFilter.addMappingForUrlPatterns(EnumSet.of(DispatcherType.REQUEST), true, "/*");
    }

    /**
     * https://www.cnblogs.com/tiancai/p/17175803.html/
     * @param registry
     */
    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        registry.addInterceptor(new TestInterceptor()).addPathPatterns("/**").excludePathPatterns("/log");
    }
}
