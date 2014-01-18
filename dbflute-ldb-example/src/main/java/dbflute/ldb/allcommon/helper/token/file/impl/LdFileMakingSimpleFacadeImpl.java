/*
 * Copyright(c) DBFlute TestCo.,TestLtd. All Rights Reserved.
 */
package dbflute.ldb.allcommon.helper.token.file.impl;

import dbflute.ldb.allcommon.helper.token.file.LdFileToken;

import dbflute.ldb.allcommon.helper.token.file.LdFileMakingCallback;
import dbflute.ldb.allcommon.helper.token.file.LdFileMakingOption;
import dbflute.ldb.allcommon.helper.token.file.LdFileMakingRowResource;
import dbflute.ldb.allcommon.helper.token.file.LdFileMakingSimpleFacade;

/**
 * @author DBFlute(AutoGenerator)
 */
public class LdFileMakingSimpleFacadeImpl implements LdFileMakingSimpleFacade {

    protected LdFileToken _fileToken = new LdFileTokenImpl();

    public void setFileToken(LdFileToken fileToken) {
        this._fileToken = fileToken;
    }

    /**
     * Make token-file from row-list.
     * 
     * @param filename Output target file name. (NotNull)
     * @param rowList Row-list composed of value-list. (NotNull)
     * @param fileMakingOption File-making option. (NotNull and Required{encoding and delimiter})
     * @throws java.io.FileNotFoundException
     * @throws java.io.IOException
     */
    public void makeFromRowList(final String filename, final java.util.List<java.util.List<String>> rowList, final LdFileMakingOption fileMakingOption) throws java.io.FileNotFoundException, java.io.IOException {
        final LdFileMakingCallback fileMakingCallback = new LdFileMakingCallback() {
            protected int rowCount = 0;
            public LdFileMakingRowResource getRowResource() {
                ++rowCount;
                if (rowList.size() < rowCount) {
                    return null;// The End!
                }
                final java.util.List<String> valueList = (java.util.List<String>)rowList.get(rowCount - 1);
                final LdFileMakingRowResource fileMakingRowResource = new LdFileMakingRowResource();
                fileMakingRowResource.setValueList(valueList);
                return fileMakingRowResource;
            }
        };
        _fileToken.make(filename, fileMakingCallback, fileMakingOption);
    }

    /**
     * Make bytes from row-list.
     * 
     * @param rowList Row-list composed of value-list. (NotNull)
     * @param fileMakingOption File-making option. (NotNull and Required{encoding and delimiter})
     * @return Result byte array. (NotNull)
     * @throws java.io.FileNotFoundException
     * @throws java.io.IOException
     */
    public byte[] makeFromRowList(final java.util.List<java.util.List<String>> rowList, final LdFileMakingOption fileMakingOption) throws java.io.FileNotFoundException, java.io.IOException {
        final LdFileMakingCallback fileMakingCallback = new LdFileMakingCallback() {
            protected int rowCount = 0;
            public LdFileMakingRowResource getRowResource() {
                ++rowCount;
                if (rowList.size() < rowCount) {
                    return null;// The End!
                }
                final java.util.List<String> valueList = (java.util.List<String>)rowList.get(rowCount - 1);
                final LdFileMakingRowResource fileMakingRowResource = new LdFileMakingRowResource();
                fileMakingRowResource.setValueList(valueList);
                return fileMakingRowResource;
            }
        };
        final java.io.ByteArrayOutputStream baos = new java.io.ByteArrayOutputStream();
        _fileToken.make(baos, fileMakingCallback, fileMakingOption);
        return baos.toByteArray();
    }
}
