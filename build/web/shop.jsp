<%-- 
    Document   : shop
    Created on : Oct 9, 2022, 2:48:38 PM
    Author     : Can Duy Khanh
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html lang="zxx">

    <head>
        <meta charset="UTF-8">
        <meta name="description" content="Ogani Template">
        <meta name="keywords" content="Ogani, unica, creative, html">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <meta http-equiv="X-UA-Compatible" content="ie=edge">
        <title>MouseStore | Shop</title>

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
        <link rel="stylesheet" href="./css/style.css" type="text/css">

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
                    <li><a href="./blog.html">Blog</a></li>
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
                        <div class="col-lg-6">
                            <div class="header__top__left">
                                <ul>
                                    <li><i class="fa fa-envelope"></i> mousestore2022@gmail.com</li>
                                    <li>Genuine product by VietNam</li>
                                </ul>
                            </div>
                        </div>
                        <div class="col-lg-6">
                            <div class="header__top__right">
                                <div class="header__top__right__social">
                                    <a href="#"><i class="fa fa-facebook"></i></a>
                                    <a href="#"><i class="fa fa-twitter"></i></a>
                                    <a href="#"><i class="fa fa-linkedin"></i></a>
                                    <a href="#"><i class="fa fa-pinterest-p"></i></a>
                                </div>
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
                        </div>
                    </div>
                </div>
            </div>
            <div class="container">
                <div class="row">
                    <div class="col-lg-3">
                        <div class="header__logo">
                            <a href="./index.html"><img src="img/logo.png" alt=""></a>
                        </div>
                    </div>
                    <div class="col-lg-6">
                        <nav class="header__menu">
                            <!--                            <ul>
                                                            <li><a href="./home">Home</a></li>
                                                            <li class="active"><a href="./shop">Shop</a></li>
                                                            <li><a href="#">Pages</a>
                                                                <ul class="header__menu__dropdown">
                                                                    <li><a href="./shop-details.html">Shop Details</a></li>
                                                                    <li><a href="./shoping-cart.html">Shoping Cart</a></li>
                                                                    <li><a href="./checkout.html">Check Out</a></li>
                                                                    <li><a href="./blog-details.html">Blog Details</a></li>
                                                                </ul>
                                                            </li>
                                                            <li><a href="./blog.html">Blog</a></li>
                                                            <li><a href="./contact.html">Contact</a></li>
                                                        </ul>-->
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
                                            <li><a href="checkout">Check Out</a></li>
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
                            <div class="header__cart__price">item: <span>Mouse</span></div>
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
                                <form action="shop1" method="get">
                                    <div class="hero__search__categories">
                                        All Categories
                                        <span class="arrow_carrot-down"></span>
                                    </div>
                                    <input name="key" type="text" value="${requestScope.key}" placeholder="What do you need?">
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

        <!-- Breadcrumb Section Begin -->
        <section class="breadcrumb-section set-bg" data-setbg="img/breadcrumb.jpg">
            <div class="container">
                <div class="row">
                    <div class="col-lg-12 text-center">
                        <div class="breadcrumb__text">
                            <h2>Mouse Shop</h2>
                            <div class="breadcrumb__option">
                                <a href="./home">Home</a>
                                <span>Shop</span>
                            </div>
                        </div>
                    </div>
                </div>
            </div>
        </section>
        <!-- Breadcrumb Section End -->

        <!-- Product Section Begin -->
        <section class="product spad">
            <div class="container">
                <!--                them thanh taskbar-->
                <div id="menu_tab">
                    <c:set var="cat" value="${requestScope.category}"/>
                    <c:set var="cid" value="${requestScope.cid}"/>
                    <ul class="menu">


                    </ul>
                </div> 

                <nav aria-label="breadcrumb">
                    <ol class="breadcrumb">
                        <li><a class="${cid==0?"active":""}" href="shop1?cid=${0}">All</a></li>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
                            <c:forEach items="${cat}" var="c">
                            <li><a class="${c.id==cid?"active":""}" href="shop1?cid=${c.id}">${c.name}</a></li>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
                            </c:forEach>
                        <!--                        <li class="breadcrumb-item"><a href="#">Home</a></li>-->
                    </ol>
                </nav>
                <div class="row">
                    <!-- Thanh taskbar category o ben trai -->
                    <div class="col-lg-3 col-md-5">
                        <div class="sidebar">
                            <div class="sidebar__item">
                                <h4>Category</h4>

                                <form id="f1" action="shop1">
                                    <c:set var="cat" value="${requestScope.category}"/>
                                    <c:set var="cate" value="${requestScope.cate}"/>
                                    <div class="input-checkbox">
                                        <input type="checkbox" id="c0" name="cidd" ${cate[0]?"checked":""} value="${0}" onclick="setCheck(this)"/>
                                        <label for="c0">
                                            <span></span>
                                            All
                                        </label>
                                    </div>
                                    <c:forEach begin="0" end="${cat.size()-1}" var="i">
                                        <div class="input-checkbox">
                                            <input type="checkbox" id="category-${cat.get(i).getId()}" name="cidd" ${cat.get(i).getId()==cid?"checked":""} value="${cat.get(i).getId()}" ${cate[i+1]?"checked":""} onclick="setCheck(this)"/>
                                            <label for="category-${cat.get(i).getId()}">
                                                <span></span>
                                                ${cat.get(i).getName()}
                                            </label>
                                        </div>
                                    </c:forEach>
                                </form>
                            </div>


                            <div class="sidebar__item">
                                <h4>Price</h4>
                                <form id="f2" action="shop1">
                                    <c:set var="pp" value="${requestScope.pp}"/>
                                    <c:set var="pb" value="${requestScope.pb}"/>
                                    <div class="input-checkbox">
                                        <input type="checkbox" id="g0" name="price" ${pb[0]?"checked":""} value="0" onclick="setCheck1(this)"/>
                                        <label for="g0">
                                            <span></span>
                                            All
                                        </label>
                                    </div>
                                    <c:forEach begin="0" end="${2}"  var="i">
                                        <div class="input-checkbox">
                                            <input type="checkbox" id="price-${i}" name="price" ${pb[i+1]?"checked":""} value="${(i+1)}" onclick="setCheck1(this)"/>
                                            <label for="price-${i}">
                                                <span></span>
                                                ${pp[i]}
                                            </label>
                                        </div>
                                    </c:forEach>
                                </form>
                            </div>

                            <div class="sidebar__item sidebar__item__color--option">
                                <h4>Color</h4>
                                <form action="shop1">
                                    <input type="text" placeholder="Enter color of product..." name="searchColor" value="${requestScope.color}">
                                    <button type="submit" style="color:green">SEARCH</button>
                                </form>
                            </div>




                        </div>
                    </div>
                    <!-- Liet ke san pham o ben phai -->
                    <div class="col-lg-9 col-md-7">
                        
                        <div class="row">  
                            <c:forEach var="p" items="${requestScope.products}">
                                <c:if test="${p.discount==0}">
                                    <div class="col-lg-4">
                                        <div class="product__discount__item">
                                            <div class="product__discount__item__pic set-bg"
                                                 data-setbg=${p.image}>
                                                <!--  <div class="product__discount__percent">0</div>-->
                                                <ul class="product__item__pic__hover">
                                                    <li><a href="#"><i class="fa fa-heart"></i></a></li>
                                                    <li><a href="#"><i class="fa fa-retweet"></i></a></li>
                                                    <li><a href="buy?id=${p.id}&test=${2}"><i class="fa fa-shopping-cart"></i></a></li>
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
                                                    <li><a href="buy?id=${p.id}&test=${2}"><i class="fa fa-shopping-cart"></i></a></li>
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
                        <div class="product__pagination">
                            <c:set var="page" value="${requestScope.page}"/>
                            <div style="text-align: right;margin-bottom: 10px">
                                <c:forEach begin="${1}" end="${requestScope.num}" var="i">
                                    <a style="background: #EBEBEB;padding: 10px" href="shop?page=${i}" >${i}</a>
                                </c:forEach>
                            </div>
                        </div>




                    </div>




                </div>
            </div>
        </section>
        <!-- Product Section End -->





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
                            <p>Gaming mouse store</p>
                            <p>Genuine 24 months warranty</p>
                            <p> Rest assured exchange, refund when the product is defective</p>


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
        <script src="js/jsforsearch.js"></script>
        <script src="ckeditor/ckeditor.js"></script>

    </body>
    <script type="text/javascript">
                                        function buy(id) {
                                            document.f1.action = "buy?id=" + id;
                                            document.f1.submit();
                                        }
    </script>
    <!--    <script type="text/javascript">
                                            $(document).ready(function ()
                                            {
                                                //khai báo biến submit form lấy đối tượng nút submit
                                                var submit = $("button[type='submit']");
    
                                                //khi nút submit được click
                                                submit.click(function ()
                                                {
                                                    //khai báo các biến dữ liệu gửi lên server
                                                    var user = $("input[name='user']").val(); //lấy giá trị trong input user
    
                                                    //Kiểm tra xem trường đã được nhập hay chưa
                                                    if (user == '') {
                                                        alert('Vui lòng nhập Tên người dùng');
                                                        return false;
                                                    }
    
                                                    //Lấy toàn bộ dữ liệu trong Form
                                                    var data = $('form#form_input').serialize();
    
                                                    //Sử dụng phương thức Ajax.
                                                    $.ajax({
                                                        type: 'GET', //Sử dụng kiểu gửi dữ liệu POST
                                                        url: 'BuyServlet.java', //gửi dữ liệu sang trang data.php
                                                        data: data, //dữ liệu sẽ được gửi
                                                        success: function (data)  // Hàm thực thi khi nhận dữ liệu được từ server
                                                        {
                                                            if (data == 'false')
                                                            {
                                                                alert('Không có người dùng');
                                                            } else {
                                                                $('#content').html(data); dữ liệu HTML trả về sẽ được chèn vào trong thẻ có id content
                                                            }
                                                        }
                                                    });
                                                    return false;
                                                });
                                            });
        </script>-->
</html>