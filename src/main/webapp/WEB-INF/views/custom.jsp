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
		<link rev="made" href="mailto:info@danball.co.jp" />
		<link rel="next" href="inquire-pqge1.html" />
	</head>
	<body>
		<div id="head">
			<div id="head_pic1">
				<img src="<c:url value="/resources/img/logo.gif"/>" class="logo" alt="logo" />
			</div><!--/head_pic1-->
			<div id="tag_line">
				<img src="<c:url value="/resources/img/tagline.gif"/>" alt="tagline" />
			</div><!--/tag_line-->
			<div id="header_navi">
				<a href="" class="hd_link">トップ</a>|
 				<a href="http://hakoya.shop19.makeshop.jp/" class="hd_link">カタログ</a>|
 				<a href="" class="hd_link">送料と代金</a>|
				<a href="" class="hd_link">hakoya.comについて</a>
			</div><!--/header_navi-->
		</div><!--/head-->
		<div id="head_btm">
			&gt;<a href="./index.php" class="hd_link">top</a>
			&gt;&gt;ダンボールお問い合わせフォーム
		</div><!--/head_btm-->
		<div id="left">
			<!--/NAVI-->
			<div id="navi">
				<div class="cat1">
					<a href="">
						<img src="<c:url value="/resources/img/storage3-1.png" />" class="link_sw1" alt="storage" />
					</a>
					<a href="">
						<img src="<c:url value="/resources/img/move3-1.png" />" class="link_sw1" alt="moving" />
					</a>
					<a href="">
						<img src="<c:url value="/resources/img/courier3-1.png" />" class="link_sw1" alt="courier" />
					</a>
					<a href="">
						<img src="<c:url value="/resources/img/spl3-1.png"/>" class="link_sw1" alt="inquire" />
					</a>
					<a href="">
						<img src="<c:url value="/resources/img/order3-1.png"/>" class="link_sw1" alt="custom" />
					</a>
				</div><!--/cat1-->
				<div class="cat2">
					<div class="cat2_img1">
						<img src="<c:url value="/resources/img/move_sw-2.jpg"/>" class="c2_img1" alt="moving" />
					</div>
				</div><!--/cat2-->
					<div id="w3c">
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
				</div><!--/w3c-->
			</div>
		</div><!--/left-->
		<!--/左ナビゲーション領域↑-->
		<div id="main">
			<!--/MAIN-->
			<div id="info">
				<div class="info_hd">自動計算フォーム</div>
				<div class="hr1"></div>
			</div>
			<div id="txt1">
				<div class="txt1_txt1">
					ダンボール自動計算フォームでは、最も一般的な『みかん箱』
					形状のダンボール箱を、お客様の用途に併せてご注文頂けます。
				</div>
				<div class="txt1_txt1">
					<div class="t1t2_hd">具体的には?</div>
					<ul class="t1t2_ul1">
						<li class="li1">新しい商品に合うサイズのダンボール箱が欲しい。</li>
						<li class="li1">既製品で間に合わせていた包材を一新したい。</li>
						<li class="li1">ダンボール箱にオリジナルの印刷を入れたい。</li>
					</ul>
				</div><!--/txt1_txt1-->
				<div class="txt1_txt2">
					<div class="t1t2_hd">■ご注意</div>
					<ul class="t1t2_ul1">
						<li class="li1">商品はご注文を頂いてから約7営業日でお客様のお手元に届きます。</li>
						<li class="li1">お支払い方法は銀行振込、または代金引換がご利用頂けます。</li>
						<li class="li1">500箱以上のお見積もりは別途
							<a href="mailto:info@danball.co.jp">メール</a>
								もしくはお電話(0467-71-6697)でお問い合わせを頂くこともできます。</li>
						<li class="li1">
							500枚以上のお見積もりについて、お見積もり金額は算出されませんがこのまま
							フォームに入力していただき、お問い合わせをしていただけます。</li>
					</ul>
				</div><!--/txt1_txt2-->
			</div><!--/txt1-->
			<div id="txt2">
				<!--/FORM-->
				<form:form action="exec" modelAttribute="danballOrderFormTopVo" method="POST">
					<div class="txt2_txt1">
					<div class="txt2_hd">■お見積もり条件</div>
						<div class="t2t1_hd">
							<img src="<c:url value="/resources/img/box-anchor.png"/>" alt="anc" />寸法(箱の内側の寸法)を入力してください
						</div>
						<div class="t2_img1">
							<img src="<c:url value="/resources/img/box.png"/>" class="t2t1_img1" alt="anc" />
						</div>
						<div class="t2t1_val">
							<div class="size_val">
								<p><form:label path="width">①幅</form:label></p>
								<p><form:input path="width" size="20" />(mm)</p>
								<form:errors path="width" elements="span" class="input_err" />
							</div>
							<div class="size_val">
								<p><form:label path="depth">②奥行</form:label></p>
								<p><form:input path="depth" size="20" />(mm)</p>
								<form:errors path="depth" elements="span" class="input_err" />
							</div>
							<div class="size_val">
								<p><form:label path="height">③高さ</form:label></p>
								<p><form:input path="height" size="20" />(mm)</p>
								<form:errors path="height" elements="span" class="input_err" />
							</div>
						</div><!--/t2t1_val-->
					</div><!--/txt2_txt1-->
					<div class="txt2_txt2">
						<div class="t2t2_hd"><img src="<c:url value="/resources/img/box-anchor.png"/>" alt="anc" />印刷</div>
						<div class="t2_img2">
							<img src="<c:url value="/resources/img/logo_dimension.gif"/>" class="t2t2_img1" alt="dimension" />
						</div><!--/t2_img2-->
						<div class="t2t2_val">
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
							<div class="size_val">
								<p><form:label path="printPts">印刷箇所</form:label></p>
								<p><form:input path="printPts" size="20" />(箇所)</p>
								<form:errors path="printPts" elements="span" class="input_err" />
							</div>
							<div class="size_val">
								<p><form:label path="printHeight">印刷面のサイズ-高さ</form:label></p>
								<p><form:input path="printHeight" size="20" />(mm)</p>
								<form:errors path="printHeight" elements="span" class="input_err" />
							</div>
							<div class="size_val">
								<form:label path="printWidth">印刷面のサイズ-横幅</form:label></p>
								<p><form:input path="printWidth" size="20" />(mm)</p>
								<form:errors path="printWidth" elements="span" class="input_err" />
							</div>
						</div><!--/t2t2_val-->
					</div><!--/txt2_txt2-->
					<div class="txt2_txt3">
						<div class="t2t3_hd">
							<p>
							<img src="<c:url value="/resources/img/box-anchor.png"/>" alt="anc" />
							製造個数-送付先
							</p>
						</div><!--/t2t3_hd-->
						<div class="t2t3_val">
							<div class="size_val">
								<p><form:label path="pts">製造する個数</form:label></p>
								<p><form:input path="pts" size="20" />(個)</p>
								<form:errors path="pts" elements="span" class="input_err" />
							</div>
							<div class="size_val">
								<p>送付先の住所</p>
								<p>
									<form:select path="prefecture" multiple="false"> 
										<option value="<c:out value="0"/>"><c:out value="--選択して下さい--"/></option>
										<c:forEach var="mstPrefecture" items="${mstPrefecture}" varStatus="status">
											<c:choose>
												<c:when test="${mstPrefecture.prefectureValue==prefectureToLong}">
													<option value="<c:out value="${mstPrefecture.prefectureValue}"/>" selected><c:out value="${mstPrefecture.prefectureName}"/></option>
												</c:when>
												<c:otherwise>
													<option value="<c:out value="${mstPrefecture.prefectureValue}"/>" ><c:out value="${mstPrefecture.prefectureName}"/></option>
												</c:otherwise>
											</c:choose>
										</c:forEach>
									</form:select>
								</p>
							</div><!-- //size_val -->
						</div><!--/t2t3_val-->
					</div><!--/txt2_txt3-->
					<p>
						<input type="hidden" name="mode" value="page1" />
						<input type="reset" value="reset" name="B1" accesskey="0" />
						<input type="submit" value="見積もり表示" name="B2" accesskey="0" />
					</p>
				</form:form>
			</div><!--/txt2-->
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
