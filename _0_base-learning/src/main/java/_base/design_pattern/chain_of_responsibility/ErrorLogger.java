package _base.design_pattern.chain_of_responsibility;

/**
 *
 * Copyright https://wtfu.site Inc. All Rights Reserved.
 * 
 * @date 2024/1/27
 *                          @since  1.0
 *                          @author 12302
 * 
 */
public class ErrorLogger extends AbstractLogger {

    public ErrorLogger(int level){
        this.level = level;
    }

    @Override
    protected void write(String message) {
        System.out.println("Error::Logger: " + message);
    }
}
