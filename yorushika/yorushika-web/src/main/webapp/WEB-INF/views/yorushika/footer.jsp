<footer class="contents-footer">
  <!-- 
  <nav class="site-menu">
        <ul class="nav-menu">
          <li class="nav-list">
            <a class="link" href="{% url 'yorushika:overview' %}">OVERVIEW</a>
          </li>
          <li class="nav-list">
            <a class="link" href="{% url 'yorushika:recommend' %}">RECOMMEND</a>
          </li>
          <li class="nav-list">
            <a class="link" href="{% url 'yorushika:album' %}">ALBUM</a>
          </li>
          <li class="nav-list">
            <a class="link" href="{% url 'yorushika:sanctuary' %}">SANCTUARY</a>
          </li>
          {% if request.user.is_authenticated %}
            <li class="nav-list">
              <a class="link" href="{% url 'yorushika:mypage' request.user.id %}">MYPAGE</a>
            </li>
            <li class="nav-list">
              <a class="link" href="{% url 'yorushika:logout' %}">SIGNOUT</a>
            </li>
          {% else %}
            <li class="nav-list">
              <a class="link" href="{% url 'yorushika:signup' %}">SIGNUP</a>
            </li>
            <li class="nav-list">
              <a class="link" href="{% url 'yorushika:login' %}">SIGNIN</a>
            </li>
          {% endif %}
        </ul>
      </nav>
  <a class="footer-logo" href="{% url 'yorushika:index' %}">
      <img class="logo" src="{% static 'yorushika/img/footer/yorushika_logo.png' %}" alt="yorushika">
  </a>
   -->
  <p class="member">n-buna suis</p>
  <p class="formed">Formed in 2017</p>
</footer>