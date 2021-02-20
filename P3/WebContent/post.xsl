<?xml version="1.0" encoding="UTF-8"?>
<xsl:stylesheet version="1.0"
	xmlns:xsl="http://www.w3.org/1999/XSL/Transform">
	<xsl:template match="/Class">
		<html>
			<center>
				<body>
					<h1>Students Detalis</h1>
					<table border='2'>
						<tr bgcolor="pink">
							<th>ID</th>
							<th>NAME</th>
							<th>DATE OF BIRTH</th>
						</tr>
						<xsl:for-each select="student">
							<tr bgcolor="yellow">
								<td>
									<xsl:value-of select="id"></xsl:value-of>
								</td>
								<td>
									<xsl:value-of select="name"></xsl:value-of>
								</td>
								<td>
									<xsl:value-of select="dod"></xsl:value-of>
								</td>
							</tr>
						</xsl:for-each>
					</table>
				</body>
			</center>
		</html>
	</xsl:template>
</xsl:stylesheet>