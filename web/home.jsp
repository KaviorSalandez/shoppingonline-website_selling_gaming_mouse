<%-- 
    Document   : home
    Created on : Oct 15, 2022, 6:16:13 PM
    Author     : Can Duy Khanh
--%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="zxx">

    <head>
        <meta charset="UTF-8">
        <meta name="description" content="Ogani Template">
        <meta name="keywords" content="Ogani, unica, creative, html">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <meta http-equiv="X-UA-Compatible" content="ie=edge">
        <title>MouseStore | Home</title>

        <!-- Google Font -->
        <link href="https://fonts.googleapis.com/css2?family=Cairo:wght@200;300;400;600;900&display=swap" rel="stylesheet">

        <!-- Css Styles -->
        <link rel="stylesheet" href="css/bootstrap.min.css" type="text/css">
        <link rel="stylesheet" href="css/font-awesome.min.css" type="text/css">
        <link rel="stylesheet" href="css/elegant-icons.css" type="text/css">
        <link rel="stylesheet" href="css/nice-select.css" type="text/css">
        <link rel="stylesheet" href="css/jquery-ui.min.css" type="text/css">
        <link rel="stylesheet" href="css/owl.carousel.min.css" type="text/css">
        <link rel="stylesheet" href="css/slicknav.min.css" type="text/css">
        <link rel="stylesheet" href="css/style.css" type="text/css">
    </head>

    <body>
        <!-- Page Preloder -->
        <div id="preloder">
            <div class="loader"></div>
        </div>

        <!-- Humberger Begin -->
        <div class="humberger__menu__overlay"></div>
        <div class="humberger__menu__wrapper">
            <div class="humberger__menu__logo">
                <a href="#"><img src="img/logo.png" alt=""></a>
            </div>
            <div class="humberger__menu__cart">
                <ul>
                    <li><a href="#"><i class="fa fa-heart"></i> <span>1</span></a></li>
                    <li><a href="#"><i class="fa fa-shopping-bag"></i> <span>3</span></a></li>
                </ul>
                <div class="header__cart__price">item: <span>$150.00</span></div>
            </div>
            <div class="humberger__menu__widget">
                <div class="header__top__right__language">
                    <img src="img/language.png" alt="">
                    <div>English</div>
                    <span class="arrow_carrot-down"></span>
                    <ul>
                        <li><a href="#">Spanis</a></li>
                        <li><a href="#">English</a></li>
                    </ul>
                </div>
                <div class="header__top__right__auth">
                    <a href="#"><i class="fa fa-user"></i> Login</a>
                </div>
            </div>
            <nav class="humberger__menu__nav mobile-menu">
                <ul>
                    <li class="active"><a href="./home.jsp">Home</a></li>
                    <li><a href="./shop.jsp">Shop</a></li>
                    <li><a href="#">Pages</a>
                        <ul class="header__menu__dropdown">
                            <li><a href="./shop-details.html">Shop Details</a></li>
                            <li><a href="./shoping-cart.html">Shoping Cart</a></li>
                            <li><a href="./checkout.html">Check Out</a></li>
                            <li><a href="./blog-details.html">Blog Details</a></li>
                        </ul>
                    </li>
                    <li><a href="./contact.html">Contact</a></li>
                </ul>
            </nav>
            <div id="mobile-menu-wrap"></div>
            <div class="header__top__right__social">
                <a href="#"><i class="fa fa-facebook"></i></a>
                <a href="#"><i class="fa fa-twitter"></i></a>
                <a href="#"><i class="fa fa-linkedin"></i></a>
                <a href="#"><i class="fa fa-pinterest-p"></i></a>
            </div>
            <div class="humberger__menu__contact">
                <ul>
                    <li><i class="fa fa-envelope"></i> hello@colorlib.com</li>
                    <li>Free Shipping for all Order of $99</li>
                </ul>
            </div>
        </div>
        <!-- Humberger End -->

        <!-- Header Section Begin -->
        <header class="header">
            <div class="header__top">
                <div class="container">
                    <div class="row">
                        <div class="col-lg-6 col-md-6">
                            <div class="header__top__left">
                                <ul>
                                    <li><i class="fa fa-envelope"></i>mousestore2022@gmail.com</li>
                                    <li>Genuine product by VietNam</li>
                                </ul>
                            </div>
                        </div>
                        <div class="col-lg-6 col-md-6">
                            <div class="header__top__right">
                                <div class="header__top__right__social">
                                    <a href="#"><i class="fa fa-facebook"></i></a>
                                    <a href="#"><i class="fa fa-twitter"></i></a>
                                    <a href="#"><i class="fa fa-linkedin"></i></a>
                                    <a href="#"><i class="fa fa-pinterest-p"></i></a>
                                </div>
                                <div class="header__top__right__auth">
                                    <a href="#"><i class="fa fa-user"></i> Login</a>
                                </div>
                            </div>
                        </div>
                    </div>
                </div>
            </div>
            <div class="container">
                <div class="row">
                    <div class="col-lg-3">
                        <div class="header__logo">
                            <a href="./home"><img src=""/></a>
                        </div>
                    </div>
                    <div class="col-lg-6">
                        <nav class="header__menu">
                            <ul>
                                <li class="active"><a href="./home">Home</a></li>
                                <li><a href="./shop">Shop</a></li>
                                    <c:if test="${sessionScope.account==null}">
                                    <li><a href="./login.jsp">Login</a></li>
                                    </c:if>
                                    <c:if test="${sessionScope.account!=null}">
                                    <li><a href="#">Hello ${sessionScope.account.name}</a></li>
                                    </c:if>   
                                <li><a href="#">My Account</a>
                                    <ul class="header__menu__dropdown">
                                        <c:if test="${sessionScope.account!=null}">
                                            <li><a href="#">Hello ${sessionScope.account.name}</a></li>
                                            </c:if>
                                            <c:if test="${sessionScope.account.role_id==1}">
                                            <li><a href="manageAccount">Mange User</a></li>
                                            <li><a href="manage">Mange Product</a></li>
                                            <li><a href="top5">Statistics Page</a></li>
                                            </c:if>
                                            <c:if test="${sessionScope.account.role_id==2}">
                                            <li><a href="checkout.jsp">Check Out</a></li>
                                            </c:if>

                                        <c:if test="${sessionScope.account!=null}">
                                            <li><a href="changePass">Change password</a></li>
                                            <li><a href="logout" >Logout</a></li>
                                            </c:if>
                                    </ul>
                                </li>
                            </ul>
                        </nav>
                    </div>
                    <c:set var="size" value="${sessionScope.size}"/>
                    <div class="col-lg-3">
                        <div class="header__cart">
                            <ul>
                                <li><a href="#"><i class="fa fa-heart"></i> <span>1</span></a></li>
                                <li><a href="cart.jsp"><i class="fa fa-shopping-bag"></i> <span>${size}</span></a></li>
                            </ul>
                            <div class="header__cart__price">Item: <span>Mouse</span></div>
                        </div>
                    </div>
                </div>
                <div class="humberger__open">
                    <i class="fa fa-bars"></i>
                </div>
            </div>
        </header>
        <!-- Header Section End -->
        <!-- Hero Section Begin -->
        <section class="hero hero-normal">
            <div class="container">
                <div class="row">
                    <div class="col-lg-3">
                        <div class="hero__categories">
                            <div class="hero__categories__all">
                                <i class="fa fa-bars"></i>
                                <span>Category</span>
                            </div>
                            <ul>
                                <li><a href="#">All</a></li>
                                <li><a href="#">Razer Mouse</a></li>
                                <li><a href="#">Logitech Mouse</a></li>
                                <li><a href="#">Akko Mouse</a></li>
                                <li><a href="#">Fuhlen Mouse</a></li>
                                <li><a href="#">MSI Mouse</a></li>

                            </ul>
                        </div>
                    </div>
                    <div class="col-lg-9">
                        <div class="hero__search">
                            <div class="hero__search__form">
                                <form action="#">
                                    <div class="hero__search__categories">
                                        All Categories
                                        <span class="arrow_carrot-down"></span>
                                    </div>
                                    <input type="text" placeholder="What do you need?">
                                    <button type="submit" class="site-btn">SEARCH</button>
                                </form>
                            </div>
                            <div class="hero__search__phone">
                                <div class="hero__search__phone__icon">
                                    <i class="fa fa-phone"></i>
                                </div>
                                <div class="hero__search__phone__text">
                                    <h5>+65 11.188.888</h5>
                                    <span>support 24/7 time</span>
                                </div>
                            </div>
                        </div>
                    </div>
                </div>
            </div>
        </section>
        <!-- Hero Section End -->

        <!-- Hero Section Begin -->
        <section class="hero">
            <div class="container">
                <div class="row">

                    <div class="col-lg-12">
                        <div class="hero__search">
                            <!--                            <div class="hero__search__form">
                                                            <form action="#">
                                                                <div class="hero__search__categories">
                                                                    All Categories
                                                                    <span class="arrow_carrot-down"></span>
                                                                </div>
                                                                <input type="text" placeholder="What do you need?">
                                                                <button type="submit" class="site-btn">SEARCH</button>
                                                            </form>
                                                        </div>-->
                            <!--                            <div class="hero__search__phone">
                                                            <div class="hero__search__phone__icon">
                                                                <i class="fa fa-phone"></i>
                                                            </div>
                                                            <div class="hero__search__phone__text">
                                                                <h5>+84 11.188.888</h5>
                                                                <span>support 24/7 time</span>
                                                            </div>
                                                        </div>
                                                    </div>-->
                            <div class="hero__item set-bg" data-setbg="img/hero/banner.jpg">
                                <div class="hero__text">
                                    <span>Electronic equipment</span>
                                    <h2>Mouse <br />100% Quality</h2>
                                    <p>Free Pickup and Delivery Available</p>
                                    <a href="#" class="primary-btn">SHOP NOW</a>
                                </div>
                            </div>
                        </div>
                    </div>
                </div>
        </section>
        <!-- Hero Section End -->

        <!-- Categories Section Begin -->
        <section class="categories">
            <div class="container">
                <div class="row">
                    <div class="categories__slider owl-carousel">
                        <c:forEach var="c" items="${requestScope.category}">

                            <div class="col-lg-3">
                                <div class="categories__item set-bg" data-setbg=${c.image}>
                                    <h5><a href="shop1?cid=${c.id}">${c.name}</a></h5>
                                </div>
                            </div>
                        </c:forEach>

                    </div>
                </div>
            </div>
        </section>
        <!-- Categories Section End -->
        <br/>
        <br/>
        
        <br/>
        <br/>
        <br/>
        <!-- Hot sale product -->
        <section class="categories">
            <div class="container">
                <div class="section-title product__discount__title">
                    <h2>Sale Off</h2>
                </div>
                <div class="row">
                    <div class="product__discount__slider owl-carousel">
                        <c:forEach var="p2" items="${requestScope.list9SaleProducts}">

                            <c:if test="${p2.discount==0}">
                                <div class="col-lg-4">
                                    <div class="product__discount__item">
                                        <div class="product__discount__item__pic set-bg"
                                             data-setbg=${p2.image}>
                                            <!--                                                <div class="product__discount__percent">0</div>-->
                                            <ul class="product__item__pic__hover">
                                                <li><a href="#"><i class="fa fa-heart"></i></a></li>
                                                <li><a href="#"><i class="fa fa-retweet"></i></a></li>
                                                <li><a href="buy?id=${p2.id}&test=${1}"><i class="fa fa-shopping-cart"></i></a></li>
                                            </ul>

                                        </div>
                                        <div class="product__discount__item__text">
                                            <h5><a href="detail?id=${p2.id}">${p2.title}</a></h5>
                                            <div class="product__item__price">${p2.price} <span></span></div>
                                        </div>
                                    </div>
                                </div>       
                            </c:if>

                            <c:if test="${p2.discount!=0}">
                                <div class="col-lg-4">
                                    <div class="product__discount__item">
                                        <div class="product__discount__item__pic set-bg"
                                             data-setbg=${p2.image}>

                                            <div class="product__discount__percent">-${p2.discount}%</div>
                                            <ul class="product__item__pic__hover">
                                                <li><a href="#"><i class="fa fa-heart"></i></a></li>
                                                <li><a href="#"><i class="fa fa-retweet"></i></a></li>
                                                <li><a href="buy?id=${p2.id}&test=${1}"><i class="fa fa-shopping-cart"></i></a></li>
                                            </ul>
                                        </div>
                                        <div class="product__discount__item__text">
                                            <h5><a href="detail?id=${p2.id}">${p2.title}</a></h5>
                                            <div class="product__item__price">${p2.price-(p2.price*p2.discount/100)}$ <span>${p2.price}$</span></div>
                                        </div>
                                    </div>
                                </div>       
                            </c:if>
                        </c:forEach>
                    </div>
                </div>
            </div>
        </section>

        <br/>
        <br/>
        <!-- New product -->
        <section class="categories">
            <div class="container">
                <div class="section-title product__discount__title">
                    <h2>New Product</h2>
                </div>
                <div class="row">
                    <div class="product__discount__slider owl-carousel">
                        <c:forEach var="p" items="${requestScope.list12newproducts}">


                            <c:if test="${p.discount==0}">
                                <div class="col-lg-4">
                                    <div class="product__discount__item">
                                        <div class="product__discount__item__pic set-bg"
                                             data-setbg=${p.image}>
                                            <!--                                                <div class="product__discount__percent">0</div>-->
                                            <ul class="product__item__pic__hover">
                                                <li><a href="#"><i class="fa fa-heart"></i></a></li>
                                                <li><a href="#"><i class="fa fa-retweet"></i></a></li>
                                                <li><a href="buy?id=${p.id}&test=${1}"><i class="fa fa-shopping-cart"></i></a></li>
                                            </ul>
                                        </div>
                                        <div class="product__discount__item__text">
                                            <h5><a href="detail?id=${p.id}">${p.title}</a></h5>
                                            <div class="product__item__price">${p.price}$ <span></span></div>
                                        </div>
                                    </div>
                                </div>       
                            </c:if>

                            <c:if test="${p.discount!=0}">
                                <div class="col-lg-4">
                                    <div class="product__discount__item">
                                        <div class="product__discount__item__pic set-bg"
                                             data-setbg=${p.image}>
                                            <div class="product__discount__percent">-${p.discount}%</div>
                                            <ul class="product__item__pic__hover">
                                                <li><a href="#"><i class="fa fa-heart"></i></a></li>
                                                <li><a href="#"><i class="fa fa-retweet"></i></a></li>
                                                <li><a href="buy?id=${p.id}&test=${1}"><i class="fa fa-shopping-cart"></i></a></li>
                                            </ul>
                                        </div>
                                        <div class="product__discount__item__text">
                                            <h5><a href="detail?id=${p.id}">${p.title}</a></h5>
                                            <div class="product__item__price">${p.price-(p.price*p.discount/100)}$ <span>${p.price}$</span></div>
                                        </div>
                                    </div>
                                </div>       
                            </c:if>

                        </c:forEach>

                    </div>

                </div>
            </div>
        </section>
        
        <br/>
        <br/>
        <br/>
        <section class="categories">
            <div class="container">
                <div class="section-title product__discount__title">
                    <h2>Top 5 Best Selling </h2>
                </div>
                <div class="row">
                    <div class="product__discount__slider owl-carousel">
                        <c:forEach var="p3" items="${requestScope.list5BestSale}">

                            <c:if test="${p3.discount==0}">
                                <div class="col-lg-4">
                                    <div class="product__discount__item">
                                        <div class="product__discount__item__pic set-bg"
                                             data-setbg=${p3.image}>
                                            <!--                                                <div class="product__discount__percent">0</div>-->
                                            <ul class="product__item__pic__hover">
                                                <li><a href="#"><i class="fa fa-heart"></i></a></li>
                                                <li><a href="#"><i class="fa fa-retweet"></i></a></li>
                                                <li><a href="buy?id=${p3.id}&test=${1}"><i class="fa fa-shopping-cart"></i></a></li>
                                            </ul>

                                        </div>
                                        <div class="product__discount__item__text">
                                            <h5><a href="detail?id=${p3.id}">${p3.title}</a></h5>
                                            <div class="product__item__price">${p3.price} <span></span></div>
                                        </div>
                                    </div>
                                </div>       
                            </c:if>

                            <c:if test="${p3.discount!=0}">
                                <div class="col-lg-4">
                                    <div class="product__discount__item">
                                        <div class="product__discount__item__pic set-bg"
                                             data-setbg=${p3.image}>

                                            <div class="product__discount__percent">-${p3.discount}%</div>
                                            <ul class="product__item__pic__hover">
                                                <li><a href="#"><i class="fa fa-heart"></i></a></li>
                                                <li><a href="#"><i class="fa fa-retweet"></i></a></li>
                                                <li><a href="buy?id=${p3.id}&test=${1}"><i class="fa fa-shopping-cart"></i></a></li>
                                            </ul>
                                        </div>
                                        <div class="product__discount__item__text">
                                            <h5><a href="detail?id=${p3.id}">${p3.title}</a></h5>
                                            <div class="product__item__price">${p3.price-(p3.price*p3.discount/100)}$ <span>${p3.price}$</span></div>
                                        </div>
                                    </div>
                                </div>       
                            </c:if>
                        </c:forEach>
                    </div>
                </div>
            </div>
        </section>

        <br/>
        <br/>
        <br/>
        <br/>
        <br/>
        <hr/>
        <!-- Banner Begin -->
        <div class="banner">
            <div class="container">
                <div class="row">
                    <div class="col-lg-6 col-md-6 col-sm-6">
                        <div class="banner__pic">
                            <img src="img/banner/banner-1.jpg" alt="" width="585px" height="225px">
                        </div>
                    </div>
                    <div class="col-lg-6 col-md-6 col-sm-6">
                        <div class="banner__pic">
                            <img src="img/banner/banner-2.jpg" alt="" width="585px" height="225px">
                        </div>
                    </div>
                </div>
            </div>
        </div>
        <!-- Banner End -->


        <!-- Footer Section Begin -->
        <footer class="footer spad">
            <div class="container">
                <div class="row">
                    <div class="col-lg-3 col-md-6 col-sm-6">
                        <div class="footer__about">
                            <div class="footer__about__logo">
                                <a href="./index.html"><img src="img/logo.png" alt=""></a>
                            </div>
                            <ul>
                                <li>Address: 60-49 Road 11378 New York</li>
                                <li>Phone: +65 11.188.888</li>
                                <li>Email: hello@colorlib.com</li>
                            </ul>
                        </div>
                    </div>
                    <div class="col-lg-4 col-md-6 col-sm-6 offset-lg-1">
                        <div class="footer__widget">
                            <h6>Useful Links</h6>
                            <ul>
                                <li><a href="#">About Us</a></li>
                                <li><a href="#">About Our Shop</a></li>
                                <li><a href="#">Secure Shopping</a></li>
                                <li><a href="#">Delivery infomation</a></li>
                                <li><a href="#">Privacy Policy</a></li>
                                <li><a href="#">Our Sitemap</a></li>
                            </ul>
                            <ul>
                                <li><a href="#">Who We Are</a></li>
                                <li><a href="#">Our Services</a></li>
                                <li><a href="#">Projects</a></li>
                                <li><a href="#">Contact</a></li>
                                <li><a href="#">Innovation</a></li>
                                <li><a href="#">Testimonials</a></li>
                            </ul>
                        </div>
                    </div>
                    <div class="col-lg-4 col-md-12">
                        <div class="footer__widget">
                            <h6>Join Our Newsletter Now</h6>
                            <p>Get E-mail updates about our latest shop and special offers.</p>
                            <form action="#">
                                <input type="text" placeholder="Enter your mail">
                                <button type="submit" class="site-btn">Subscribe</button>
                            </form>
                            <div class="footer__widget__social">
                                <a href="#"><i class="fa fa-facebook"></i></a>
                                <a href="#"><i class="fa fa-instagram"></i></a>
                                <a href="#"><i class="fa fa-twitter"></i></a>
                                <a href="#"><i class="fa fa-pinterest"></i></a>
                            </div>
                        </div>
                    </div>
                </div>
                <div class="row">
                    <div class="col-lg-12">
                        <div class="footer__copyright">
                            <div class="footer__copyright__text"><p><!-- Link back to Colorlib can't be removed. Template is licensed under CC BY 3.0. -->
                                    Copyright &copy;<script>document.write(new Date().getFullYear());</script> All rights reserved | This template is made with <i class="fa fa-heart" aria-hidden="true"></i> by <a href="https://colorlib.com" target="_blank">Colorlib</a>
                                    <!-- Link back to Colorlib can't be removed. Template is licensed under CC BY 3.0. --></p></div>
                            <div class="footer__copyright__payment"><img src="img/payment-item.png" alt=""></div>
                        </div>
                    </div>
                </div>
            </div>
        </footer>
        <!-- Footer Section End -->

        <!-- Js Plugins -->
        <script src="js/jquery-3.3.1.min.js"></script>
        <script src="js/bootstrap.min.js"></script>
        <script src="js/jquery.nice-select.min.js"></script>
        <script src="js/jquery-ui.min.js"></script>
        <script src="js/jquery.slicknav.js"></script>
        <script src="js/mixitup.min.js"></script>
        <script src="js/owl.carousel.min.js"></script>
        <script src="js/main.js"></script>
        <script src="ckeditor/ckeditor.js"></script>



    </body>

</html>