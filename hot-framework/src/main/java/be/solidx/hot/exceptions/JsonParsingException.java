package be.solidx.hot.exceptions;

/*
 * #%L
 * Hot
 * %%
 * Copyright (C) 2010 - 2016 Solidx
 * %%
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as
 * published by the Free Software Foundation, either version 3 of the
 * License, or (at your option) any later version.
 * 
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 * 
 * You should have received a copy of the GNU General Public
 * License along with this program.  If not, see
 * <http://www.gnu.org/licenses/gpl-3.0.html>.
 * #L%
 */

public class JsonParsingException extends RuntimeException {

	private static final long serialVersionUID = 5416360377975274565L;

	public JsonParsingException() {
	}

	public JsonParsingException(String message) {
		super(message);
	}

	public JsonParsingException(Throwable cause) {
		super(cause);
	}

	public JsonParsingException(String message, Throwable cause) {
		super(message, cause);
	}
}
