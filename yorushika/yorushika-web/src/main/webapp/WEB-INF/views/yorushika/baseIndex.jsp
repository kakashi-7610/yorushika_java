<div class="first-view">
  <div class="view-text">
    <h1 class="title">Welcome to the site <br>that introduces Yorushika</h1>
    <p class="text">please have a good stay</p>
  </div>
</div>
<div class="first-lead">
  <p class="lead">このサイトではヨルシカについて記載しています。<br>
    ヨルシカの概要、おすすめ曲、<br>
    アルバム、聖地について紹介しています。<br>
    ヨルシカの良さが少しでも多くの人に伝わればと思います。
  </p>
  <div class="link-button">
  	<!-- 
    <a class="link" href="{% url 'yorushika:overview' %}">OVERVIEW</a>
  	 -->
  </div>
</div>
<div class="recommend-song">
  <h2 class="header">RECOMMEND</h2>
  <ul class="item-list">
  <!-- 
    {% for recommend in recommends %}
      <li class="song-list">
        <img src="{{ recommend.song.album.image.url }}" class="image" alt="おすすめ曲の画像">
        <dl class="item-detail">
          <dt class="detail-header">
            <span class="title">{{ recommend.song }}</span>
            <a class="spotify" href="{{ recommend.song.url }}" target="_blank">spotifyで聞く</a>
          </dt>
          <dd class="text">{{ recommend.text|truncatechars:100 }}</dd>
        </dl>
      </li>
    {% endfor %}
   -->
  	<c:forEach items="${songs}" var="song">
  		<span>${f:h(song.title)}</span>
  		<span>${f:h(song.created)}</span>
  	</c:forEach>
  </ul>
  <div class="link-button">
  <!-- 
    <a class="link" href="{% url 'yorushika:recommend' %}">RECOMMEND</a>
   -->
  </div>
</div>
