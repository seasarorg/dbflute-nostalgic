/*
 * Copyright(c) DBFlute TestCo.,TestLtd. All Rights Reserved.
 */
package dbflute.ldb.allcommon.cbean.pagenavi;

/**
 * The setupper of page number link.
 * @param <LINK> The type of link.
 * @author DBFlute(AutoGenerator)
 */
public interface LdPageNumberLinkSetupper<LINK extends LdPageNumberLink> {

    /**
     * Set up page number link.
     * @param pageNumberElement Page number element.
     * @param current Is current page?
     * @return Page number link. (NotNull)
     */
    public LINK setup(int pageNumberElement, boolean current);
}
