package study_0420;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BJ_20304_조현빈2 {

	public static void main( String[] args ) throws Exception {
		BufferedReader  br = new BufferedReader( new InputStreamReader( System.in ) );
		StringTokenizer st = new StringTokenizer( br.readLine() );
		System.out.println( Integer.parseInt( st.nextToken() ) * Integer.parseInt( st.nextToken() ) );
	}
}
