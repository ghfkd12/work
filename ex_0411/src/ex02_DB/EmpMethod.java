package ex02_DB;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class EmpMethod {
	
	public static List<Emp> find(String job){
		List<Emp> list = new ArrayList<>();
		
		
		// Emp테이블에서 사원번호, 이름, 직종, 급여를 조회해서
		// 하나의 행을 Emp객체에 넣은 후 그 객체들을 ArrayList에 담아서 반환
		
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
//		String sql = "SELECT empno, ename, job, sal from emp where job ='"+job+"'";
		String sql = "SELECT empno, ename, job, sal from emp where job = ?";
		
		try {
			conn = DBUtil.getConnection();
	        pstmt = conn.prepareStatement(sql);
	        // ?부분 채워넣기
	        pstmt.setString(1, job);
	        // 첫번째 ?자리에 매개변수로 들어온 job값으로 채워라
	        rs = pstmt.executeQuery();
	
	        while(rs.next()) {
	        	Emp e = new Emp();
//	            int empno = rs.getInt("empno");
//	            String ename = rs.getString("ename");
//	            String job = rs.getString("job");
//	            int salary = rs.getInt("sal");
	        	e.setEmpno(rs.getInt("empno"));
	        	e.setEname(rs.getString("ename"));
	        	e.setJob(rs.getString("job"));
	        	e.setSalary(rs.getInt("sal"));
//	            System.out.printf("사번 : %d, 이름 : %s, 직무: %s, 급여: %d\n",empno,ename,job,salary);
	        	
	        	list.add(e);
	        	
	        	
	         }
			
		} catch (Exception e) {
			// TODO: handle exception
		} finally {
			try {
				if(rs != null) {
					rs.close();
				}
				
				if(pstmt != null) {
					pstmt.close();
				}
				
				if(conn != null) {
					conn.close();
				}
				
			} catch (Exception e2) {
				// TODO: handle exception
			}
		}
		return list;
		
	}
}
