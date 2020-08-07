$(function() {  //gnb, sidebar 클릭시 스타일 현재 상태 스타일링을 위한 시연용 스크립트 입니다. 구현시 삭제 필요
  $('.tr-hover td, aside.sidebar li a').click(
     function() {
       $(this).parent().toggleClass('current').siblings().removeClass("current");
     }
   );
    $('.page-num a').click(
     function() {
       $(this).parent().toggleClass('on').siblings().removeClass("on");
     }
   );
   $(".reset_text a").click(function(){$(".resetpwlayer").show();return false;});
   $(".btn_close,.buttons button",".dim40").click(function(){$(".dim40").hide();});
 });

 

 
