/*package Rough;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

import java.sql.Blob;
import java.sql.Connection;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.log4j.Logger;

import com.mits.lap.common.util.DBUtil;

*//**
 * @author mitsind759 Servlet implementation class DowloadServlet for verifier
 *         has to verify the document making dowload the files
 *//*
@WebServlet("/DowloadServlet")
public class DownloadFileServlet extends HttpServlet {// class declaration
	private static final long serialVersionUID = 1L;

	private static final int BUFFER_SIZE = 20000;

	// using logger for debuge

	static final Logger LOGGER = Logger.getLogger(DownloadFileServlet.class);

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// get applicationid, document type

		String appId = (String) request.getAttribute("appId");
		LOGGER.info("::::::::::::::::appId::::::::::::" + appId);
		String idProof = (String) request.getAttribute("idProof");
		LOGGER.info("::::::::::::::::idProof::::::::::::" + idProof);

		Connection conn = null;
		OutputStream out = null;

		DBUtil objDBUtil = new DBUtil();

		PreparedStatement statement = null;
		ResultSet result = null;
		try {
			LOGGER.info("::::::::::::::::insideTryblock::::::::::::" + idProof);
			// connection to the database
			conn = objDBUtil.getConnection();

			// queries the database
			String sql = "SELECT * FROM mits759_LAP_DOUCMENTTYPE WHERE applicationnumber =? and documenttype=?";
			statement = conn.prepareStatement(sql);
			statement.setString(1, appId);
			statement.setString(2, idProof);

			result = statement.executeQuery();
			if (result.next()) {
				// gets file name and file blob data
				String fileName = result.getString(4);

				Blob blob = result.getBlob(6);

				java.io.InputStream inputStream = blob.getBinaryStream();

				int fileLength = result.getInt(5);

				ServletContext context = getServletContext();

				// sets MIME type for the file download

				// String Mimetype = result.getString(3);

				LOGGER.info("::::::::::::::::insideMimetype from DB:::::::::::" + fileName);
				String mimeType = context.getMimeType(fileName);
				LOGGER.info("::::::::::::::::insideifmimeType) from context::::::::::::" + mimeType);
				if (mimeType == null) {

					mimeType = "application/octet-stream";
				}

				LOGGER.info("mimeType : " + mimeType);

				response.setContentType(mimeType);
				response.setContentLength(fileLength);
				String headerKey = "content-Disposition";
				LOGGER.info("fileName+Extension :*" + fileName + mimeType + "*");
				String headerValue = String.format("attachment; filename=\"%s\"", fileName + ".jpg");
				response.setHeader(headerKey, headerValue);
				out = response.getOutputStream();
				byte[] buffer = new byte[BUFFER_SIZE];
				int bytesRead = -1;

				while ((bytesRead = inputStream.read(buffer)) != -1) {
					out.write(buffer, 0, bytesRead);
				}

				inputStream.close();
				out.close();
			}
			// exception handling
		} catch (SQLException ex) {
			ex.printStackTrace();
			response.getWriter().print("SQL Error: " + ex.getMessage());
		} catch (IOException ex) {
			ex.printStackTrace();
			response.getWriter().print("IO Error: " + ex.getMessage());
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			if (conn != null) {
				// closes the database connection
				try {
					conn.close();
				} catch (SQLException ex) {
					ex.printStackTrace();
				}
			}
		}
	}

	// declaration of dopost method
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		doPost(request, response);
	}

}// end of class
*/