<!DOCTYPE html>
<html>
<head>
  <meta charset="UTF-8">
  <title>yorushika introduction website</title>
  <!-- 
  <link rel="stylesheet" href="{% sass_src 'yorushika/css/yorushika-style.scss' %}" />
  <link rel="preconnect" href="https://fonts.googleapis.com">
  <link rel="preconnect" href="https://fonts.gstatic.com" crossorigin>
  <link href="https://fonts.googleapis.com/css2?family=Montserrat:wght@700&display=swap" rel="stylesheet">
  <script src="{% static 'yorushika/js/base.js' %}"></script>
   -->
  <meta name="description" content="ページの概要分を記載します">
  <meta name="viewport" content="width=device-width">
</head>
<body class="contents-wrapper">
  <jsp:include page="header.jsp" />
  <main class="contents-body">
    <jsp:include page="baseSanctuary.jsp" />
  </main>
  <jsp:include page="footer.jsp" />
</body>
</html>