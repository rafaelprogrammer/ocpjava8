package languageEnhancements;

import java.io.IOException;
import java.sql.SQLException;
import java.time.format.DateTimeParseException;

public class MultiCach {

	public void multiCatch() throws IOException, SQLException, DateTimeParseException {
		try {
			throw new IOException();
		} catch (IOException | DateTimeParseException e) {
			System.err.println(e);
			throw e;
		}
	}

	public void multiCatch2() throws IOException, SQLException, DateTimeParseException {
		try {
			throw new SQLException();
		} catch (SQLException | DateTimeParseException e) {
			System.err.println(e);
			throw e;
		}
	}

	public void multiCatch3() throws IOException, SQLException, DateTimeParseException {
		try {
			throw new SQLException();
		} catch (Exception e) {
			System.err.println(e);
			throw e;
		}
	}

}
