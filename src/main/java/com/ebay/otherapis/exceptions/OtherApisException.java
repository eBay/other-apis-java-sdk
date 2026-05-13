package com.ebay.otherapis.exceptions;

/**
 * Base exception for Other APIs SDK errors.
 */
public class OtherApisException extends RuntimeException {
    public OtherApisException(String message) {
        super(message);
    }

    public OtherApisException(String message, Throwable cause) {
        super(message, cause);
    }
}
