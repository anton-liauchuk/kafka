package org.apache.kafka.connect.reporter;

public interface ErrorHandler<T> {

	ErrorHandlerResponse handleError(ErrorContext<T> context);

	enum ErrorHandlerResponse {
		DROP,
		FAIL,
		ACK
	}
}
