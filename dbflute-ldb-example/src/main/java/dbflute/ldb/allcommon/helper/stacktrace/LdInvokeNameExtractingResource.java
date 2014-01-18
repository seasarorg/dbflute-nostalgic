/*
 * Copyright(c) DBFlute TestCo.,TestLtd. All Rights Reserved.
 */
package dbflute.ldb.allcommon.helper.stacktrace;

/**
 * @author DBFlute(AutoGenerator)
 */
public interface LdInvokeNameExtractingResource {

    public boolean isTargetElement(String className, String methodName);
    public String filterSimpleClassName(String simpleClassName);
    public boolean isUseAdditionalInfo();
    public int getStartIndex();
    public int getLoopSize();
}