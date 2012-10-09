<#include "/navigation/admin_top.ftl">

<link href="/jquery/themes/base/ui.all.css" rel="stylesheet" type="text/css"/>

<script type="text/javascript" src="/jquery/1.8.4/jquery-ui.min.js"></script>
<script type="text/javascript" src="/jquery/jshashtable-2.1.js"></script>


<div id="container" class="master">
	<h2 class="master-header-table">App Test</h2>
	<div class="master-table-box">
		
		<div class="master-table-inner">
			<div class="table-wrapper group">
				<table id="app_test" class="tabular hoverable" style="width:100%;">
					<thead>
						<tr>
							<td class="left" style="width:100px;">Actions</td>
						</tr>
					</thead>
					<tbody>

						<tr>
							<td>${list}</td>
						</tr>
					</tbody>
				</table>
			</div>
			
		</div>
		<div id="master-nav-bar">
			<button id="cancelButton" name="closeButton" class="closeButton" onclick="window.location.href='/bin/front';">Close</button>
		</div>
	</div>
</div>

<#include "/navigation/footer.ftl">