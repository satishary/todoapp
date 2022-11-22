<%@include  file="header.jsp" %>
<title>Demo Page</title>
<style>  
    div {  
        width: auto;  
    }  
    img {  
        max-width:100%;  
        height: 300px;  
    }  
</style> 
</head>
<center>
    <h1>
        <h1 style="background-color:DodgerBlue;"></h1></h1>
</center>
<body>
    <%@include  file="menu.jsp" %>
    <div class="container">
        <div class="row">
            <div class="col-md-12">





                <div id="carouselExampleIndicators" class="carousel slide" data-bs-ride="true">
                    <div class="carousel-indicators">
                        <button type="button" data-bs-target="#carouselExampleIndicators" data-bs-slide-to="0" class="active" aria-current="true" aria-label="Slide 1"></button>
                        <button type="button" data-bs-target="#carouselExampleIndicators" data-bs-slide-to="1" aria-label="Slide 2"></button>
                        <button type="button" data-bs-target="#carouselExampleIndicators" data-bs-slide-to="2" aria-label="Slide 3"></button>
                    </div>
                    <center>
                        <div class="carousel-inner">
                            <div class="carousel-item active">
                                <img src="Images/1.jpg" class="d-block w-80" alt="...">
                            </div>
                            <div class="carousel-item">
                                <img src="Images/2.jpg" class="d-block w-80" alt="...">
                            </div>
                            <div class="carousel-item">
                                <img src="Images/3.jpg" class="d-block w-80" alt="...">
                                </center>
                            </div>
                        </div>
                        <button class="carousel-control-prev" type="button" data-bs-target="#carouselExampleIndicators" data-bs-slide="prev">
                            <span class="carousel-control-prev-icon" aria-hidden="true"></span>
                            <span class="visually-hidden">Previous</span>
                        </button>
                        <button class="carousel-control-next" type="button" data-bs-target="#carouselExampleIndicators" data-bs-slide="next">
                            <span class="carousel-control-next-icon" aria-hidden="true"></span>
                            <span class="visually-hidden">Next</span>
                        </button>

                        <section class="site-banner">
                            <div class="container">
                                <div class="row">
                                    <div class="col-lg-6 col-md-12 site-title">
                                        <h3 class="title-text">Hey</h3>
                                        <h1 class="title-text text-uppercase">I am Satish</h1>
                                        <h4 class="title-text text-uppercase">Web Developer</h4>
                                        <div class="site-buttons">
                                            <div class="d-flex flex-row flex-wrap">
                                                <button type="button" class="btn button primary-button mr-4 text-uppercase">hire
                                                    me</button>
                                                <button type="button" class="btn button secondary-button text-uppercase">Get cv</button>
                                            </div>
                                        </div>
                                    </div>
                                </div>
                                <div class="col-lg-6 col-md-12 about-title">
                                    <h2 class="text-uppercase pt-5">
                                        <span>Let me</span>
                                        <span>introduce</span>
                                        <span>myself</span>
                                    </h2>
                                    <div class="paragraph py-4 w-75">
                                        <p class="para">
                                            Lorem ipsum dolor sit amet consectetur adipisicing elit. Error rerum iure obcaecati vel
                                            possimus officia maiores perferendis ut! Quos, perspiciatis.
                                        </p>
                                        <p class="para">
                                            It is a long established fact that a reader will be distracted by the readable content
                                            of a page when looking at its layout. The point of using Lorem Ipsum is that it has a
                                            more-or-less normal distribution of letters, as opposed to using 'Content here, content
                                            here
                                        </p>
                                    </div>
                                    <button type="button" class="btn button primary-button text-uppercase">Download cv</button>
                                </div>

                                <section class="project-area">
                                    <div class="container">
                                        <div class="project-title pb-5">
                                            <h1 class="text-uppercase title-h1">Recently Done Project</h1>
                                            <h1 class="text-uppercase title-h1">TODO</h1>
                                        </div>

                                        <div class="button-group">
                                            <button type="button" class="active" id="btn1" data-filter="*">All</button>
                                            <button type="button" data-filter=".popular">Popular</button>
                                            <button type="button" data-filter=".latest">Latest</button>
                                            <button type="button" data-filter=".following">Following</button>
                                            <button type="button" data-filter=".upcoming">Upcoming</button>
                                        </div>

                                        <div class="row grid">
                                            <div class="col-lg-4 col-md-6 col-sm-12 element-item latest">
                                                <div class="our-project">
                                                    <div class="img">
                                                        <a class="test-popup-link" href="./img/portfolio/p1.jpg">
                                                            <img src="./img/portfolio/p1.jpg" alt="portfolio-1" class="img-fluid">
                                                        </a>
                                                    </div>
                                                    <div class="title py-4">
                                                        <h4 class="text-uppercase">Minimul Desing</h4>
                                                        <span class="text-secondary">Latest, Portfolio</span>
                                                    </div>
                                                </div>
                                            </div>
                                            <div class="col-lg-4 col-md-6 col-sm-12 element-item popular">
                                                <div class="our-project">
                                                    <div class="img">
                                                        <a class="test-popup-link" href="./img/portfolio/p2.jpg">
                                                            <img src="./img/portfolio/p2.jpg" alt="portfolio-2" class="img-fluid">
                                                        </a>
                                                    </div>
                                                    <div class="title py-4">
                                                        <h4 class="text-uppercase">Paint Wall</h4>
                                                        <span class="text-secondary">Popular, Portfolio</span>
                                                    </div>
                                                </div>
                                            </div>
                                            <div class="col-lg-4 col-md-6 col-sm-12 element-item popular">
                                                <div class="our-project">
                                                    <div class="img">
                                                        <a class="test-popup-link" href="./img/portfolio/p3.jpg">
                                                            <img src="./img/portfolio/p3.jpg" alt="portfolio-3" class="img-fluid">
                                                        </a>
                                                    </div>
                                                    <div class="title py-4">
                                                        <h4 class="text-uppercase">Female light</h4>
                                                        <span class="text-secondary">Popular, Portfolio</span>
                                                    </div>
                                                </div>
                                            </div>
                                            <div class="col-lg-4 col-md-6 col-sm-12 element-item upcoming">
                                                <div class="our-project">
                                                    <div class="img">
                                                        <a class="test-popup-link" href="./img/portfolio/p4.jpg">
                                                            <img src="./img/portfolio/p4.jpg" alt="portfolio-4" class="img-fluid">
                                                        </a>
                                                    </div>
                                                    <div class="title py-4">
                                                        <h4 class="text-uppercase">Fourth Air</h4>
                                                        <span class="text-secondary">Upcoming, Portfolio</span>
                                                    </div>
                                                </div>
                                            </div>
                                            <div class="col-lg-4 col-md-6 col-sm-12 element-item upcoming">
                                                <div class="our-project">
                                                    <div class="img">
                                                        <a class="test-popup-link" href="./img/portfolio/p5.jpg">
                                                            <img src="./img/portfolio/p5.jpg" alt="portfolio-5" class="img-fluid">
                                                        </a>
                                                    </div>
                                                    <div class="title py-4">
                                                        <h4 class="text-uppercase">Muliple fown</h4>
                                                        <span class="text-secondary">Upcoming, Portfolio</span>
                                                    </div>
                                                </div>
                                            </div>
                                            <div class="col-lg-4 col-md-6 col-sm-12 element-item following">
                                                <div class="our-project">
                                                    <div class="img">
                                                        <a class="test-popup-link" href="./img/portfolio/p6.jpg">
                                                            <img src="./img/portfolio/p6.jpg" alt="portfolio-6" class="img-fluid">
                                                        </a>
                                                    </div>
                                                    <div class="title py-4">
                                                        <h4 class="text-uppercase">Together sign</h4>
                                                        <span class="text-secondary">Following, Portfolio</span>
                                                    </div>
                                                </div>
                                            </div>
                                            <div class="col-lg-4 col-md-6 col-sm-12 element-item following">
                                                <div class="our-project">
                                                    <div class="img">
                                                        <a class="test-popup-link" href="./img/portfolio/p7.jpg">
                                                            <img src="./img/portfolio/p7.jpg" alt="portfolio-7" class="img-fluid">
                                                        </a>
                                                    </div>
                                                    <div class="title py-4">
                                                        <h4 class="text-uppercase">Green Heaven</h4>
                                                        <span class="text-secondary">Following, Portfolio</span>
                                                    </div>
                                                </div>
                                            </div>
                                            <div class="col-lg-4 col-md-6 col-sm-12 element-item following">
                                                <div class="our-project">
                                                    <div class="img">
                                                        <a class="test-popup-link" href="./img/portfolio/p8.jpg">
                                                            <img src="./img/portfolio/p8.jpg" alt="portfolio-8" class="img-fluid">
                                                        </a>
                                                    </div>
                                                    <div class="title py-4">
                                                        <h4 class="text-uppercase">Fly Male</h4>
                                                        <span class="text-secondary">Following, Portfolio</span>
                                                    </div>
                                                </div>
                                            </div>
                                            <div class="col-lg-4 col-md-6 col-sm-12 element-item upcoming">
                                                <div class="our-project">
                                                    <div class="img">
                                                        <a class="test-popup-link" href="./img/portfolio/p9.jpg">
                                                            <img src="./img/portfolio/p9.jpg" alt="portfolio-9" class="img-fluid">
                                                        </a>
                                                    </div>
                                                    <div class="title py-4">
                                                        <h4 class="text-uppercase">Camera Lens</h4>
                                                        <span class="text-secondary">Upcoming, Portfolio</span>
                                                    </div>
                                                </div>
                                            </div>
                                        </div>
                                    </div>
                                </section>
                            </div>

                            <%@include  file="footer.jsp" %>