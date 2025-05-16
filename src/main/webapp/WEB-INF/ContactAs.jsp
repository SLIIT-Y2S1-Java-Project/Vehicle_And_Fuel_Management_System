<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Home Page</title>
<link rel="stylesheet" href="css/bootstrap.min.css">

<style>
	.div1{
		margin: 0px;
		font-size: 23px;
	}
	body{
		background-color: #F9F8F6;
	}
	.flex-container{
		display: flex;
		justify-content: space-around;
		align-items: center;
	}
	.flex{
		margin: 100px;
	}
	.a{
		text-decoration: none;
		font-size: 30px;
		color: black;
	}
	.img{
		width:30px;
		height:30px;
	}
	.flex-container2{
		display: flex;
		margin-left:340px;
	}
	.common-div{
		display: flex;
		margin: 60px;
		justify-content: space-around;
	}
	.image{
		width: 250px;
		height: 250px;
		margin-right: 100px;
		border-radius: 40px;
	}
	.container {
	  position: relative;
	  width: 50%;
	}
	
	.image {
	  opacity: 1;
	  display: block;
	  width: 100%;
	  height: auto;
	  transition: .5s ease;
	  backface-visibility: hidden;
	}
	
	.middle {
	  transition: .5s ease;
	  opacity: 0;
	  position: absolute;
	  top: 50%;
	  left: 50%;
	  transform: translate(-50%, -50%);
	  -ms-transform: translate(-50%, -50%);
	  text-align: center;
	}
	
	.container:hover .image {
	  opacity: 0.3;
	}
	
	.container:hover .middle {
	  opacity: 1;
	}
	
	.text {
	  background-color: black;
	  color: white;
	  font-size: 16px;
	  padding: 16px 32px;
	  border-radius: 20px;
	  
	}
	logi.{
	}
</style>
 <link rel='stylesheet' id='contact-form-7-css' href='https://automiraj.lk/wp-content/plugins/contact-form-7/includes/css/styles.css?ver=5.8.5' type='text/css' media='all'/>
     <link rel='stylesheet' id='mfn-be-css' href='https://automiraj.lk/wp-content/themes/betheme/css/be.css?ver=26.3' type='text/css' media='all'/>
     
        <style id='mfn-dynamic-inline-css' type='text/css'>
     html {
                background-color: #FCFCFC
            }

            #Footer .widgets_wrapper {
                padding: 70px 0
            }

            body {
                font-size: 14px;
                line-height: 26px;
                font-weight: 400;
                letter-spacing: 0px
            }
 

            @media only screen and (min-width: 768px) and (max-width:959px) {
                body {
                    font-size:13px;
                    line-height: 22px;
                    font-weight: 400;
                    letter-spacing: 0px
                }

                .big {
                    font-size: 14px;
                    line-height: 23px;
                    font-weight: 400;
                    letter-spacing: 0px
                }

                #menu > ul > li > a,a.action_button,#overlay-menu ul li a {
                    font-size: 13px;
                    font-weight: 800;
                    letter-spacing: 0px
                }
        
            }
 

            @media only screen and (min-width: 1240px) {
                #Wrapper,.with_aside .content_wrapper {
                    max-width:1100px
                }

                .section_wrapper,.container {
                    max-width: 1080px
                }

                .layout-boxed.header-boxed #Top_bar.is-sticky {
                    max-width: 1100px
                }
            }

            .footer_button {
                color: #65666C!important;
                background-color: transparent;
                box-shadow: none!important
            }

            .footer_button:after {
                display: none!important
            }
 
           
            #Footer {
                background-color: #121212
            }

            
            #Footer,#Footer .widget_recent_entries ul li a {
                color: #4d4d4d
            }

            #Footer a:not(.button) {
                color: #808080
            }

            #Footer a:not(.button):hover {
                color: #f2ab41
            }

            #Footer h1,#Footer h1 a,#Footer h1 a:hover,#Footer h2,#Footer h2 a,#Footer h2 a:hover,#Footer h3,#Footer h3 a,#Footer h3 a:hover,#Footer h4,#Footer h4 a,#Footer h4 a:hover,#Footer h5,#Footer h5 a,#Footer h5 a:hover,#Footer h6,#Footer h6 a,#Footer h6 a:hover {
                color: #ffffff
            }

            #Footer .themecolor,#Footer .widget_meta ul,#Footer .widget_pages ul,#Footer .widget_rss ul,#Footer .widget_mfn_recent_comments ul li:after,#Footer .widget_archive ul,#Footer .widget_recent_comments ul li:after,#Footer .widget_nav_menu ul,#Footer .widget_price_filter .price_label .from,#Footer .widget_price_filter .price_label .to,#Footer .star-rating span {
                color: #f2ab41
            }

            #Footer .themebg,#Footer .widget_categories ul,#Footer .Recent_posts ul li .desc:after,#Footer .Recent_posts ul li .photo .c,#Footer .widget_recent_entries ul li:after,#Footer .widget_mfn_menu ul li a:hover,#Footer .widget_product_categories ul {
                background-color: #f2ab41
            }

            #Footer .Recent_posts ul li a .desc .date,#Footer .widget_recent_entries ul li .post-date,#Footer .tp_recent_tweets .twitter_time,#Footer .widget_price_filter .price_label,#Footer .shop-filters .woocommerce-result-count,#Footer ul.product_list_widget li .quantity,#Footer .widget_shopping_cart ul.product_list_widget li dl {
                color: #a8a8a8
            }

            #Footer .footer_copy .social li a,#Footer .footer_copy .social-menu a {
                color: #65666C
            }

            #Footer .footer_copy .social li a:hover,#Footer .footer_copy .social-menu a:hover {
                color: #FFFFFF
            }

            #Footer .footer_copy {
                border-top-color: rgba(255,255,255,0.1)
            }

        </style>
		<style>
			.dropbtn {
			  background-color: #8AD5E8
;
			  color: white;
			  padding: 12px;
			  font-size: 16px;
			  border: none;
			  cursor: pointer;
			  border-radius:5px;
			  width: 50px;
			}
			
			.dropdown {
			  position: relative;
			  display: inline-block;
			}
			
			.dropdown-content {
			  display: none;
			  position: absolute;
			  background-color: #f9f9f9;
			  min-width: 100px;
			  box-shadow: 0px 8px 16px 0px rgba(0,0,0,0.2);
			  z-index: 1;
			}
			
			.dropdown-content a {
			  color: black;
			  padding: 5px 19px;
			  text-decoration: none;
			  display: block;
			   font-size: 14px;
			}
			
			.dropdown-content a:hover {background-color: #BEE7F2}
			
			.dropdown:hover .dropdown-content {
			  display: block;
			}
			
			.dropdown:hover .dropbtn {
			  background-color:#64A7B8;
			}
		</style>
		
		<style >
		
		.contact{
		 width: 100px;
		 height:100px;
		 background-color: red;
		 margin-top: 100px;
		
		
		
		}
		.cont2{
		 width: 40%;
		 height:100px;
		 background-color: blue;
		float: left;
		}
		
		
		</style>
</head>
<body>
<div>
	<div class="div1">
		<nav class="navbar navbar-expand-lg navbar-light " style="background-color:#F4F3EF;">
		  <a class="navbar-brand" href="HomePage.jsp"><img src="logo/image1copy.png" style="width:140px; height:70px;margin-top:10px;margin-left:50px;"></a>
		  <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarSupportedContent" aria-controls="navbarSupportedContent" aria-expanded="false" aria-label="Toggle navigation">
		    <span class="navbar-toggler-icon"></span>
		  </button>
		
 <div class="collapse navbar-collapse" id="navbarSupportedContent" style="margin-left:85px;font-family:Consolas;">
	 <ul class="navbar-nav mr-auto">
		      <li class="nav-item active" >
		        <a class="nav-link" href="Home.jsp">HOME</a>
		      </li>
		      <li class="nav-item">
		        <a class="nav-link" href="aboutUs.jsp" style="margin-left:12px;">ABOUTUS</a>
		      </li>
		      <li class="nav-item">
		        <a class="nav-link" href="contactUs.jsp" style="margin-left:12px;">SERVICES</a>
		      </li>
		      <li class="nav-item">
		        <a class="nav-link" href="branch.jsp"style="margin-left:12px;">BRANCHES</a>
		      </li>
		      <li class="nav-item">
		        <a class="nav-link" href="fuel.jsp"style="margin-left:12px;">PACKAGES</a>
		      </li>
		      <li class="nav-item">
		        <a class="nav-link" href="ContactAs.jsp"style="margin-left:12px;">CONTACT</a>
		      </li>
		      <li class="nav-item" style="margin-left:200px;background-color:#A8A6A3;border-radius:5px">
		         <div class="dropdown">
  					<button class="dropbtn">LOGIN</button>
				  		<div class="dropdown-content">
				  			<a href="login.jsp">LoginAdmin</a>
				 			 <a href="#">LoginManger</a>
				 			 <a href="#">LoaginCustomer</a>
 						 </div>
		    		  </li>
		      
	 			</ul>
		   
			</div>
		  
		  </div>
		</nav>
	</div>
</div>


<div>
<div style="width: 100px;
		 height:100px;
		 background-color: red;
		
		   dispay:inline-block;">

			<div class="mb-3" >
			  <label for="exampleFormControlInput1" class="form-label">Email address</label>
			  <input type="email" class="form-control" id="exampleFormControlInput1" placeholder="name@example.com">
			</div>
			<div class="mb-3">
			  <label for="exampleFormControlTextarea1" class="form-label">Example textarea</label>
			  <textarea class="form-control" id="exampleFormControlTextarea1" rows="3"></textarea>
			</div>
			</div><div style="width: 100px;
		 height:100px;
		 background-color:blue;
		 margin-top: 10px;
		 
		  dispay:inline-block;
		  ">
<h1>Hello 2</h1>
</div>
</div>



	           <div>        
	            <footer id="Footer" class="clearfix " role="contentinfo">
	                <div class="widgets_wrapper center">
	                    <div class="container">
	                        <div class="column mobile-one tablet-one-second one-second">
	                            <div class="mcb-column-inner">
	                                <aside id="custom_html-5" class="widget_text widget widget_custom_html">
	                                    <div class="textwidget custom-html-widget">
	                                        <h6>CITY NETWORK</h6>
	                                        <hr class="no_line" style="margin: 0 auto 5px auto"/>
	                                        <div class="column one-third mobile-one">
	                                            <div class="mcb-column-inner">
	                                                <ul>
	                                                    <li>
	                                                        <a href="#">Colombo</a>
	                                                    </li>
	                                                    <li>
	                                                        <a href="#">Kandy</a>
	                                                    </li>
	                                                    <li>
	                                                        <a href="#">Nittambuwa</a>
	                                                    </li>
	                                                </ul>
	                                            </div>
	                                        </div>
	                                        <div class="column one-third mobile-one">
	                                            <div class="mcb-column-inner">
	                                                <ul>
	                                                    <li>
	                                                        <a href="#">Galle</a>
	                                                    </li>
	                                                    <li>
	                                                        <a href="#">Badulla</a>
	                                                    </li>
	                                                    <li>
	                                                        <a href="#">Kalutara</a>
	                                                    </li>
	                                                </ul>
	                                            </div>
	                                        </div>
	                                        <div class="column one-third mobile-one">
	                                            <div class="mcb-column-inner">
	                                                <ul>
	                                                    <li>
	                                                        <a href="#">Gampaha</a>
	                                                    </li>
	                                                    <li>
	                                                        <a href="#">Kadana</a>
	                                                    </li>
	                                                    <li>
	                                                        <a href="#">Panadura</a>
	                                                    </li>
	                                                </ul>
	                                            </div>
	                                        </div>
	                                    </div>
	                                </aside>
	                            </div>
	                        </div>
	                        <div class="column mobile-one tablet-one-fourth one-fourth">
	                            <div class="mcb-column-inner">
	                                <aside id="custom_html-6" class="widget_text widget widget_custom_html">
	                                    <div class="textwidget custom-html-widget">
	                                        <h6>CITY OFFICE</h6>
	                                        <hr class="no_line" style="margin: 0 auto 5px auto"/>
	                                        <p>
	                                            51/1 Kandawathha Road, <br/>
	                                            Nittambuwa, <br/>Sri Lanka
	
	                                        </p>
	                                    </div>
	                                </aside>
	                            </div>
	                        </div>
	                        <div class="column mobile-one tablet-one-fourth one-fourth">
	                            <div class="mcb-column-inner">
	                                <aside id="custom_html-7" class="widget_text widget widget_custom_html">
	                                    <div class="textwidget custom-html-widget">
	                                        <h6>OPENING HOURS</h6>
	                                        <hr class="no_line" style="margin: 0 auto 5px auto"/>
	                                        <p>
	                                            <span style="color: #ccc;">Mon - Fri:</span>
	                                            7 AM - 6 PM<br/>
	                                            <span style="color: #ccc;">Sat - Sun:</span>
	                                            7 AM - 6 PM
	
	                                        </p>
	                                    </div>
	                                </aside>
	                            </div>
	                        </div>
	                    </div>
	                </div>
	                <div class="footer_copy">
	                    <div class="container">
	                        <div class="column one mobile-one">
	                            <div class="mcb-column-inner">
	                                <a id="back_to_top" class="footer_button" href="">
	                                    <i class="icon-up-open-big" aria-label="Back to top icon"></i>
	                                </a>
	                                <div class="copyright">All Rights Reserved by AUTOVISION.             </div>
	                                <ul class="social" role="navigation" aria-label="Social Menu"></ul>
	                            </div>
	                        </div>
	                    </div>
	                </div>
	            </footer>
	        </div>

</body>
</html>