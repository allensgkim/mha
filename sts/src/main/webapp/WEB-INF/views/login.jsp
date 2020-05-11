<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<html>
    <head>
        <title>Warehouse Management System</title>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />
        <%@ include file="../common/commonLink.jspf" %>
        <script>
            $(function() {  //gnb, sidebar 클릭시 스타일 현재 상태 스타일링을 위한 시연용 스크립트 입니다. 구현시 삭제 필요
                $(".reset_password a").click(function(){$(".resetpwlayer").show();return false;});
                $(".btn_close,.buttons button",".dim40").click(function(){$(".dim40").hide();});
            });
        </script>
    </head>
    
    <body class="body_bg">
        <div class="login_wrap">
            <div class="content_wrap">
                
                <!-- 로그인 Area -->
                <div class="login_area">
                    <!-- 아이디 로그인 -->
                    <h1>
                        <span class="title">Warehouse System</span>
                    </h1>
                    <p class="ver">Version 1.0</p>
                    <fieldset>
                        <ul class="user_input">
                            <li>
                                <p class="input_box">
                                    <span class="usrId"></span>
                                    <input placeholder="ID" name="usrId" title="아이디" autocomplete="off" tabindex="1" type="text">
                                </p>
                            </li>
                            <li>
                                <p class="input_box">
                                    <span class="usrPw"></span>
                                    <input placeholder="Password" name="usrPw" title="비밀번호" autocomplete="off" tabindex="2" type="password">
                                </p> 
                            </li>
                        </ul>
                        <div class="user_save">
                            <button onClick="window.location.href='admin_사용자관리.html'">Login</button>
                        </div>
                    </fieldset>
                    <p class="reset_password">
                        <a href="">Change Password</a>
                    </p>
                    <!--// 아이디 로그인 -->
                </div>
                <!-- // 로그인 Area -->
            </div>
            <p class="copyright">Copyright Ⓒ 2020 by WMS, Co., LTD. All rights reserved.</p>
        </div>

        
        <div id="parentLayer" class="resetpwlayer dim40">
            <div class="layer">
                <div class="layerhead">
                    <h3>Reset Password</h3>
                    <a href="#" class="btn_close" title="닫기">Close</a>
                </div>
                <!-- //layerhead -->
                <div class="layerBody">
                    <div class="board">
                        <form>
                            <fieldset>
                                <ul class="reset_pw">
                                    <li>
                                        <label>ID</label>
                                        <input type="text" value="WMS_ADMIN">
                                    </li>
                                    <li>
                                        <label>Current Password</label>
                                        <input type="password" value="">
                                    </li>
                                    <li>
                                        <label>New Password</label>
                                        <input type="password" value="">
                                        <p class="tip"><span>(염문, 숫자, 특수기호 포함 8자 이상)</span></p>
                                    </li>
                                    <li>
                                        <label>Confirm New Password</label>
                                        <input type="password" value="">
                                    </li>
                                </ul>
                            </fieldset>
                        </form>
                    </div>
                    
                    <!-- // board-content list -->
                    <div class="board-foot">
                        <div class="buttons">
                            <button>OK</button>
                            <button>Close</button>
                        </div>
                    </div>
                    <!-- // buttons -->
                </div>
                <!-- // layerBody -->
            </div>
            <!-- // layer --> 
        </div>
        <!-- //parentLayer -->

    </body>
</html>