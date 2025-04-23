package com.cts.exceptions;

import java.time.LocalDateTime;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@Data
@NoArgsConstructor
@AllArgsConstructor
public class ExceptionResponse {

	private int status;
	private String message;
	private LocalDateTime time;
}
