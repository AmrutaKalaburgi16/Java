<html>
<head>
<title>Application Form</title>
</head>
<body>
<h2>Application Form</h2>
<%
    String name=request.getParameter("name");
    String gender=request.getParameter("gen");
    String email=request.getParameter("em");

       String ph = request.getParameter("ph");
         long num = Long.parseLong(ph);
   %>

    <%= "Hello " +name+ "and "+gender+". I am working in a company and my mailId is"+ email+ "and phone number is "+ph

%>
"Hello "+ ${param.name}+"and "+${param.gen}+". I am working in a company and my mailId is"+ ${param.em}+ "and phone number is "+${param.ph}


</body>

</html>