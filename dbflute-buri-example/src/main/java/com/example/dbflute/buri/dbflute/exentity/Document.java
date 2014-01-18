package com.example.dbflute.buri.dbflute.exentity;

/**
 * The entity of DOCUMENT.
 * <p>
 * You can implement your original methods here.
 * This class is NOT overrided when re-generating.
 * </p>
 * @author DBFlute(AutoGenerator)
 */
public class Document extends com.example.dbflute.buri.dbflute.bsentity.BsDocument {

    /** Serial version UID. (Default) */
    private static final long serialVersionUID = 1L;
    
    public Document() {
        super();
    }
    public Document(String title, String context) {
        _title = title;
        _content = context;
    }
}
