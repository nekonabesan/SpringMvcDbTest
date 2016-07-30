<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@ page import="java.util.*" %>
<?xml version="1.0" encoding="UTF-8" ?>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML Basic 1.0//EN" "http://www.w3.org/TR/xhtml-basic/xhtml-basic10.dtd">
<html xmlns="http://www.w3.org/1999/xhtml" xml:lang="ja">
	<head>
		<meta http-equiv="content-type" content="text/html; charset=UTF-8" />
		<meta http-equiv="Content-Language" content="ja" />
		<title>ダンボールの箱屋ドットコム - オーダーメイド - ダンボール自動見積もり</title>
		<meta name="description" content="ダンボール箱製造販売の箱屋ドットコム" />
		<meta name="keywords" content="ダンボール ,ダンボール箱 ,だんぼーる ,ダンボール販売" />
		<meta http-equiv="X-UA-Compatible" content="IE=emulateIE8" />
		<link rel="stylesheet" type="text/css" href="<c:url value="/resources/css/import.css" />" media="all" />
		<script src="<c:url value="/resources/js/jquery-1.7.1.min.js" />"></script>
		<script src="<c:url value="/resources/js/formTop.js" />"></script>
		<link rev="made" href="mailto:info@danball.co.jp" />
		<link rel="next" href="inquire-pqge1.html" />
	</head>
	<body>
		<div id="head">
		<div id="head_pic1">
			<img src="<c:url value="/resources/img/logo.gif"/>" class="logo" alt="logo">
		</div><!--/head_pic1-->
		<div id="tag_line">
			<img src="<c:url value="/resources/img/tagline.gif"/>" alt="tagline">
		</div><!--/tag_line-->
		<div id="header_navi">
			<a href="" class="hd_link">トップ</a>|
	 		<a href="" class="hd_link">カタログ</a>|
	 		<a href="" class="hd_link">送料と代金</a>|
			<a href="" class="hd_link">hakoya.comについて</a>
		</div><!--/header_navi-->
		</div><!--/head-->
		<div id="head_btm">
		&gt;<a href="" class="hd_link">top</a>
		&gt;&gt;ダンボールお問い合わせフォーム
		</div><!--/head_btm-->
		<div id="left">
			<!--/NAVI-->
			<div id="navi">
				<div class="cat1">
				<a href="">
					<img src="<c:url value="/resources/img/storage3-1.png"/>" class="link_sw1" alt="storage">
				</a>
				<a href="">
					<img src="<c:url value="/resources/img/move3-1.png"/>" class="link_sw1" alt="moving">
				</a>
				<a href="">
					<img src="<c:url value="/resources/img/courier3-1.png"/>" class="link_sw1" alt="courier">
				</a>
				<a href="">
					<img src="<c:url value="/resources/img/spl3-1.png"/>" class="link_sw1" alt="inquire">
				</a>
				<a href="">
					<img src="<c:url value="/resources/img/order3-1.png"/>" class="link_sw1" alt="custom">
				</a>
				</div><!--/cat1-->
				<div class="cat2">
				<div class="cat2_img1">
					<img src="<c:url value="/resources/img/move_sw-2.jpg"/>" class="c2_img1" alt="moving">
				</div>
				</div><!--/cat2-->
					<!--<div id="w3c">
						<p>
						<a href="http://validator.w3.org/check?uri=referer">
						<img src="http://www.w3.org/Icons/valid-xhtmlbasic10" alt="Valid XHTML Basic 1.0" height="31" width="88" /></a>
						</p>
						<p>
						<a href="http://jigsaw.w3.org/css-validator/check/referer">
						<img  width="88px" height="31px" src="http://jigsaw.w3.org/css-validator/images/vcss" alt="正当なCSSです!" /></a>
						</p>
						<p>
						<a href="http://jigsaw.w3.org/css-validator/check/referer">
						<img width="88px" height="31px" src="http://jigsaw.w3.org/css-validator/images/vcss-blue" alt="正当なCSSです!" /></a>
						</p>
					</div>--><!--/w3c-->
			</div><!-- //navi -->
		</div><!--/left-->
		<!--/左ナビゲーション領域↑-->
		<div id="main">
			<!--/MAIN-->
			<!--/実行有りのテーブル-->
		  	<div id="txt1">
		  	<form:form action="recalc" modelAttribute="danballOrderFormTopVo" method="POST">
			  	<!--  -->
			  	<table class="size">
				  	<tbody>
					  	<tr>
					  		<td colspan="3" class="hd1">お見積もり内容</td>
					  	</tr>
					  	<tr>
					  		<td colspan="2" class="td50">内寸</td>
					  		<td class="td50">備考</td>
					  	</tr>
					  	<tr>
					  		<td><form:label path="width">①幅</form:label></td>
					  		<td>
					  			<form:input path="width" size="20" />(mm)
					  			<form:errors path="width" elements="span" class="input_err" />
					  		</td>
					  		<td rowspan="3">
					  		■寸法の目安<br>
					  		規定外の寸法の製品の見積りは、こちらのフォームからお受けできません。<br>
					  		幅185(mm)- 奥行き105(mm)以上の値を入力してください。
					  		</td>
					  	</tr>
					  	<tr>
					  		<td><form:label path="depth">②奥行</form:label></td>
					  		<td>
						  		<form:input path="depth" size="20" />(mm)
						  		<form:errors path="depth" elements="span" class="input_err" />
					  		</td>
					  	</tr>
					  	<tr>
					  		<td><form:label path="height">③高さ</form:label></td>
					  		<td>
					  			<form:input path="height" size="20" />(mm)
								<form:errors path="height" elements="span" class="input_err" />
					  		</td>
					  	</tr>
					  	<tr>
					  		<td colspan="2" class="td50">外寸</td>
					  		<td class="td50">備考</td>
					  	</tr>
					  	<tr>
					  		<td>幅</td>
					  		<td><div class="size_val2">${calcProcessingPriceVo.widthOuter}</div>(mm)</td>
					  		<td rowspan="3">
					  		<img src="<c:url value="/resources/img/shop_img/caution3.png"/>" class="caution">注意<br>
					  		ダンボールの寸法は<div class="bolder2">箱の内側</div>の寸法が基準になります。
					  		</td>
					  	</tr>
					  	<tr>
					  		<td>奥行き</td>
					  		<td><div class="size_val2">${calcProcessingPriceVo.depthOuter}</div>(mm)</td>
					  	</tr>
					  	<tr>
					  		<td>高さ</td>
					  		<td><div class="size_val2">${calcProcessingPriceVo.heightOuter}</div>(mm)</td>
					  	</tr>
					  	<tr>
					  		<td colspan="2">
					  			<p>印刷の有無</p>
								<c:choose>
									<c:when test="${empty danballOrderFormTopVo.printFlg}">
										<p><form:radiobutton path="printFlg" value="1" />印刷する</p>
										<p><form:radiobutton path="printFlg" value="0" checked="checked" />印刷しない</p>
									</c:when>
									<c:when test="${danballOrderFormTopVo.printFlg==1}">
										<p><form:radiobutton path="printFlg" value="1" checked="checked" />印刷する</p>
										<p><form:radiobutton path="printFlg" value="0" />印刷しない</p>
									</c:when>
									<c:otherwise>
										<p><form:radiobutton path="printFlg" value="1" />印刷する</p>
										<p><form:radiobutton path="printFlg" value="0" checked="checked" />印刷しない</p>
									</c:otherwise>
								</c:choose>
					  		</td>
					  		<td>
					  			<!--/印刷の詳細と版のサイズ-->
								<p><form:label path="printPts">印刷箇所</form:label></p>
								<p><form:input path="printPts" size="20" />(箇所)</p>
								<form:errors path="printPts" elements="span" class="input_err" />	
								印刷サイズ(新規製版時のみ記入)<br>
								<p><form:label path="printHeight">印刷面のサイズ-高さ</form:label></p>
								<p><form:input path="printHeight" size="20" />(mm)</p>
								<form:errors path="printHeight" elements="span" class="input_err" />
								×<br>
								<form:label path="printWidth">印刷面のサイズ-横幅</form:label></p>
								<p><form:input path="printWidth" size="20" />(mm)</p>
								<form:errors path="printWidth" elements="span" class="input_err" />
<!-- 								<input type="radio" id="f1" name="desine" value="そのまま印刷できる原稿を用意する"> -->
<!-- 								そのまま印刷できる原稿を用意する<br> -->
<!-- 								<input type="radio" id="f1" name="desine" value="文字原稿だけ用意してデザインは依頼する" checked=""> -->
<!-- 								文字原稿だけ用意してデザインは依頼する<br> -->
<!-- 								デザインの内容によっては<br>版元のイメージ<div class="bolder2">制作費がかわります</div>。<br>  		 -->
							</td><!--/-->
					  	</tr>
					  	<tr>
					  		<td colspan="3">
					  			<p><form:label path="pts">製造する個数</form:label></p>
								<p><form:input path="pts" size="20" />(個)</p>
								<form:errors path="pts" elements="span" class="input_err" />
					  		</td>
					  	</tr>
					  	<tr>
					  		<td colspan="3">
								<p>送付先の住所</p>
								<p><select name="pref"> 
									<c:forEach var="mstPrefecture" items="${mstPrefecture}" varStatus="status">
										<c:choose>
											<c:when test="${danballOrderFormTopVo.prefecture==status.count}">
												<option value="<c:out value="${mstPrefecture.prefectureValue}"/>" selected><c:out value="${mstPrefecture.prefectureName}"/></option>
											</c:when>
											<c:otherwise>
												<option value="<c:out value="${mstPrefecture.prefectureValue}"/>" ><c:out value="${mstPrefecture.prefectureName}"/></option>
											</c:otherwise>
										</c:choose>
									</c:forEach>
								</select>配送先(都道府県)</p>
						  		<img src="<c:url value="/resources/img/shop_img/caution3.png"/>" class="caution">
						  		<p>配送先の指定がない場合、お引き取りを前提として原材料費+製函工賃の</p>
						  		<div class="indent">合計金額のみが表示されます。</div><br>
						  		<!--/-->
						  		<img src="<c:url value="/resources/img/shop_img/caution3.png"/>" class="caution">
						  		<div class="bolder2">沖縄県、及び島嶼部への発送</div>につきましては、自動計算フォームで表示される送料は<br>
						  		<div class="indent">あくまで参考価格であり、実際の送料は別途お見積もりとなります。</div>
					  		</td>
					  	</tr>
					  	<tr>
					  		<input type="hidden" name="mode" value="page1" id="f1">
					  		<td colspan="3">見積り条件をかえて計算<input type="button" value="再計算" id="recalc"></td>
					  	</tr>
					  	<tr>
					  		<td colspan="3" class="hd1">お見積もり金額</td>
					  	</tr>
					  	<tr>
					  		<td colspan="3">
						  		<!--/ERR処理-->
						  		<!--/料金表示TABLE-->
								<table class="production_fee">
									<tbody>
										<tr>
											<td colspan="4">■詳細見積もり■</td>
										</tr>
										<tr>
											<td>項目</td>
											<td>数量</td>
											<td>金額</td>
											<td>単位</td>
										</tr>
										<tr>
											<td>小計</td>
											<td></td>
											<td>${calcProcessingPriceVo.processingPricePerSeat}</td>
											<td>円</td>
										</tr>
										<tr>
											<td>ダンボール箱</td>
											<td>${calcProcessingPriceVo.pts}(個)</td>
											<td>${calcProcessingPriceVo.processingPriceSum}</td>
											<td>円</td>
										</tr>
										<tr>
											<td>送料</td>
											<td>${calcProcessingPriceVo.baggegies}(個口)</td>
											<td></td>
											<td>円</td>
										</tr>
										<tr>
											<td>消費税</td>
											<td></td>
											<td>${calcProcessingPriceVo.taxSum}</td>
											<td>円</td>
										</tr>
										<tr>
											<td>代引き手数料</td>
											<td></td>
											<td>${calcProcessingPriceVo.SETTELEMENT_FEE}</td>
											<td>円</td>
										</tr>
										<tr>
											<td>合計</td>
											<td></td>
											<td>${calcProcessingPriceVo.priceSum}</td>
											<td>円</td>
										</tr>
									</tbody>
								</table><!-- //production_fee -->
								<!-- //料金表示テーブル終端 -->
					  		</td>
					  	</tr>
				  	</tbody>
			  	</table><!-- //size -->
		  	</form:form><!-- //再計算用フォームの終端 -->
		</div><!-- //txt1 -->
	  	<div id="txt2">
	  		<!--//再計算結果格納用フォーム	-->
			<form:form action="exec" modelAttribute="danballOrderFormTopVo" method="POST">
				<!--/送信用-->
				<!--/{ERR:0}{mode:page2}-->
			
			  	<div class="txt2_txt1">
			  		電子メールアドレス<input type="text" name="mail" size="40" value=""><br> 
			  		電話番号<input type="text" name="tell" size="40" value=""><br> 
			  		箱の用途･備考:<br> 
			  	</div>
			  	<div class="txt2_txt1">
			  		<textarea rows="6" cols="65" wrap="soft" name="message" value=""></textarea>
			  	</div>
			  	<div class="txt2_txt1">
			  		中に入れる物の重さや大きさなどをできるだけ具体的にお書きください。
			  		それにより、より適切な紙の質やサイズなどをアドバイス差し上げることができます。
			  		（例：「重さ1キロ程度の液体入りポリタンクを2つ収納して宅配便で送付するために使用」
			  		「A4サイズの書類を詰めて、倉庫に5箱程度ずつ積み重ねて収納するために使用」など）
			  		大きさの違う版を複数使用する、多色印刷するなど、このフォームでは入力できない内容や、ご質問などもこの欄にご記入ください。
			  	</div>
			  	<div class="txt2_txt1"> 
			  		■重要なお知らせ■<br> 
			  		こちらのフォームはお問い合わせフォームでありメールの送信をもって
			  		<div class="bolder2">正式なご注文にはなりません</div>。<br> 
			  		お取引をご成約いただくためには担当者よりの連絡をお待ちください。
			  		<!--/使用中止--> 
			  		<!--/■夏期休業のお知らせ■ <br />
			  		8月11日より19日までお休みをいただきます。その間にいただいたご注文は、
			  		8月20日以降に順次製造・発送させていただきます。あらかじめご了承ください。<br />-->
			  	</div>
				<input type="hidden" name="width" value="400" id="f2">
				<input type="hidden" name="dps" value="300" id="f2">
				<input type="hidden" name="height" value="250" id="f2">
				<input type="hidden" name="OutW" value="410" id="f2">
				<input type="hidden" name="OutD" value="310" id="f2">
				<input type="hidden" name="OutH" value="270" id="f2">
				<input type="hidden" name="print" value="deny" id="f2">
				<input type="hidden" name="spp" value="0" id="f2">
				<input type="hidden" name="PW" value="0" id="f2">
				<input type="hidden" name="PH" value="0" id="f2">
				<input type="hidden" name="desine" value="" id="f2">
				<input type="hidden" name="nop" value="100" id="f2">
				<input type="hidden" name="pref" value=" " id="f2">
				<input type="hidden" name="sum1" value="104" id="f2">
				<input type="hidden" name="sum2" value="10401" id="f2">
				<input type="hidden" name="sum3" value="0" id="f2">
				<input type="hidden" name="sum4" value="3" id="f2">
				<input type="hidden" name="sum5" value="0" id="f2">
				<input type="hidden" name="sum6" value="522" id="f2">
				<input type="hidden" name="sum7" value="315" id="f2">
				<input type="hidden" name="sum8" value="11238" id="f2">
				<input type="hidden" name="ErrFlg1" value="0" id="f2">
				<input type="hidden" name="ErrFlg3" value="0" id="f2">
		  	</form:form><!-- //再計算結果格納用フォーム終端 -->
		</div><!--/txt2-->
		<div id="txt3">
		  <div class="txt3_txt1">
		<div class="indent">
		  <input type="hidden" name="mode" value="page2" id="f2">
		  確認画面へ進む<input type="submit" value="確認画面へ" name="B2" id="f2">
		 </div>
		  </div>
		</div>
  
	</div><!--/main-->
		<div id="futter">
		<div class="p1">
			<a href="./" class="fut_link">hakoya.comと有限会社ダンボールについて</a>
			<a href="./" class="fut_link">特定商取引に関する法律に基づく表示</a>
		</div><!--/p1-->
		<div class="p2">
			ご不明な点などは、どんなことでも
			<a href="mailto:info@danball.co.jp" class="fut_link">info@danball.co.jpまたは</a>
			0467-71-6697まで
		</div><!--/p2-->
		<div class="p3">copyright (C) 有限会社ダンボール</div>
		</div><!--/futter-->
</body>
</html>
