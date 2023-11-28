<!-- 
{% extends 'yorushika/base.html' %}

{% block content %}
 -->

<div class="top-image -sanctuary">
  <h1 class="title">SANCTUARY</h1>
  <p class="text">聖地巡礼</p>
</div>
<div class="sanctuary-contents">
  <h2 class="title">SANCTUARY LIST</h2>
  <ul class="sanctuary-list">
  	<c:forEach items="${sanctuaries}" var="sanctuary">
      <li class="sanctuary-map">
      	<!-- 
        <dt class="title">${f:h(sanctuary.sanctuary)}/{{ sanctuary.song.title }}</dt>
      	 -->
      	<dt class="title">${f:h(sanctuary.sanctuary)}</dt>
        <dd class="text">${f:h(sanctuary.text)}</dd>
        <!-- 
        {% comment %} safeにすることでhtmlタグを埋め込むことができる {% endcomment %}
        {{ sanctuary.tag| safe }}
         -->
      </li>
    </c:forEach>
  </ul>
</div>

<!-- 
{% endblock %}
 -->