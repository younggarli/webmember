package util;

public class FileUtil {
	/**
	 * 
	* Method : getFileName
	* 최초작성일 : 2018. 5. 9.
	* 작성자 : K.Y.G
	* 변경이력 :
	* @param contentDisposition
	* @return
	* Method 설명 :content-disposition헤더에서 파일명을 추출
	 */
	public static String getFileName(String contentDisposition) {
		//"form-data; name=\"profile\"; filename=\"chrysanthemum.jpg\"";
		
		String[] headers = contentDisposition.split(";");
		String fileName = null;
		for (String header : headers) {
			if(header.startsWith(" filename=")){
				fileName= header.substring(" filename=".length() +1, header.length() -1);
				System.out.println(fileName);
				break;
			}
		}
		return fileName;
	}
}
