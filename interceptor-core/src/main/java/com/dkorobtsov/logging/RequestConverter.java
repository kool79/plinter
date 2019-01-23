package com.dkorobtsov.logging;

import com.dkorobtsov.logging.internal.InterceptedRequest;

/**
 * Base interface for helper classes converting client specific HTTP requests to internal {@link
 * InterceptedRequest}.
 *
 * @param <T> type of Http client specific request
 */
public interface RequestConverter<T> {

  InterceptedRequest from(T request);

}