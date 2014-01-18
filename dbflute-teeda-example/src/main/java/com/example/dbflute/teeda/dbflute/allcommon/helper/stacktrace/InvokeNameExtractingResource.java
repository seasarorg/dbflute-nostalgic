package com.example.dbflute.teeda.dbflute.allcommon.helper.stacktrace;

/**
 * @author DBFlute(AutoGenerator)
 */
public interface InvokeNameExtractingResource {

    public boolean isTargetElement(String className, String methodName);
    public String filterSimpleClassName(String simpleClassName);
    public boolean isUseAdditionalInfo();
    public int getStartIndex();
    public int getLoopSize();
}