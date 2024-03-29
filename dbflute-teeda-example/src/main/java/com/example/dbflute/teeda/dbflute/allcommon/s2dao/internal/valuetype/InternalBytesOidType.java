package com.example.dbflute.teeda.dbflute.allcommon.s2dao.internal.valuetype;

import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.sql.Blob;
import java.sql.CallableStatement;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Types;

import org.seasar.extension.jdbc.types.BytesType;

/**
 * The value type of bytes OID. (for PostgreSQL) 
 * @author DBFlute(AutoGenerator)
 */
public class InternalBytesOidType extends BytesType {

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public InternalBytesOidType() {
        super(new InternalBytesOidTrait());
    }

    // ===================================================================================
    //                                                                          Blob Trait
    //                                                                          ==========
    protected static class InternalBytesOidTrait implements Trait {
	
        public int getSqlType() {
            return Types.BLOB;
        }

        public void set(PreparedStatement ps, int parameterIndex, byte[] bytes) throws SQLException {
            ps.setBlob(parameterIndex, createBytesOidImpl(bytes));
        }

        protected Blob createBytesOidImpl(byte[] bytes) {
            return new InternalBytesOidImpl(bytes);
        }

        public void set(CallableStatement cs, String parameterName, byte[] bytes) throws SQLException {
            cs.setBytes(parameterName, bytes);
        }

        public byte[] get(ResultSet rs, int columnIndex) throws SQLException {
            return BytesType.toBytes(rs.getBlob(columnIndex));
        }

        public byte[] get(ResultSet rs, String columnName) throws SQLException {
            return BytesType.toBytes(rs.getBlob(columnName));
        }

        public byte[] get(CallableStatement cs, int columnIndex) throws SQLException {
            return BytesType.toBytes(cs.getBlob(columnIndex));
        }

        public byte[] get(CallableStatement cs, String columnName) throws SQLException {
            return BytesType.toBytes(cs.getBlob(columnName));
        }
    }

    // ===================================================================================
    //                                                                 Blob Implementation
    //                                                                 ===================
    protected static class InternalBytesOidImpl implements Blob {

        protected byte[] bytes;

        public InternalBytesOidImpl(byte[] bytes) {
            this.bytes = bytes;
        }

        public void free() throws SQLException { // for JDK-6.0
            throw new UnsupportedOperationException("free()");
        }

        public InputStream getBinaryStream() throws SQLException {
            return new ByteArrayInputStream(bytes);
        }

        public InputStream getBinaryStream(long pos, long length) throws SQLException { // for JDK-6.0
            throw new UnsupportedOperationException("getBinaryStream(pos, length)");
        }

        public byte[] getBytes(long pos, int length) throws SQLException {
            if (length == bytes.length) {
                return bytes;
            }
            byte[] result = new byte[length];
            System.arraycopy(bytes, 0, result, 0, length);
            return result;
        }

        public long length() throws SQLException {
            return bytes.length;
        }

        public long position(Blob pattern, long start) throws SQLException {
            throw new UnsupportedOperationException("position");
        }

        public long position(byte[] pattern, long start) throws SQLException {
            throw new UnsupportedOperationException("position");
        }

        public OutputStream setBinaryStream(long pos) throws SQLException {
            throw new UnsupportedOperationException("setBinaryStream");
        }

        public int setBytes(long pos, byte[] bytes, int offset, int len) throws SQLException {
            throw new UnsupportedOperationException("setBytes");
        }

        public int setBytes(long pos, byte[] bytes) throws SQLException {
            throw new UnsupportedOperationException("setBytes");
        }

        public void truncate(long len) throws SQLException {
            throw new UnsupportedOperationException("truncate");
        }
    }
}