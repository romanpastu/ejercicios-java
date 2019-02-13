<!-- Roman pastushenko -->
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<style>
	span{
	color:red
	}
</style>
<body>
	<table>
		<%
		int numerosPorFila = Integer.parseInt(request.getParameter("anchura"));
		int digitoMarcado = Integer.parseInt(request.getParameter("digito"));
		int fin = Integer.parseInt(request.getParameter("fin"));
		int numeroFilas = (fin/numerosPorFila);
		double comprobatorioFilas = fin / numerosPorFila;
		
		boolean rojo = false;
		
		int j = 1;
		
		
		
		if ( (double)fin % (double)numeroFilas > 0 ){

			
			numeroFilas++;
		}
			
		for(int i = 0 ; i<numeroFilas;i++){
				
				out.print("<tr>");
				for(int w = 0; w<numerosPorFila;w++){
					out.print("<td>");
					if(rojo == true && j<=fin){
						out.print("<span>"+j+"</span>");
						
					}else{
						if(j <= fin){
							out.print(j);
						}
						
					}
					rojo = false;
					if ( j<= fin){
						j++;	
					}else{
						w = numerosPorFila;
						i = numeroFilas;
					}
				 	
					out.print("</td>");
				}
				out.print("</tr>");
			}
		
			
		
		
		
		
	
		
	
	%>
	</table>


</body>
</html>