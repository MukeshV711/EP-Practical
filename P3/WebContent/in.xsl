<?xml version="1.0" encoding="UTF-8"?>
<xsl:stylesheet version="1.0"
	xmlns:xsl="http://www.w3.org/1999/XSL/Transform">
	<xsl:template match="/Books">
		<html>
			<center>
				<body>
					<h1>Top Five Books</h1>
					<table border='1'>
						<tr bgcolor="yellow">
							<th>Title</th>
							<th>Author</th>
							<th>Publisher</th>
							<th>Edition</th>
							<th>Price</th>
						</tr>
						<xsl:for-each select="book">
							<tr bgcolor="pink">
								<td>
									<xsl:value-of select="title"></xsl:value-of>
								</td>
								<td>
									<xsl:value-of select="author"></xsl:value-of>
								</td>
								<td>
									<xsl:value-of select="publisher"></xsl:value-of>
								</td>
								<td>
									<xsl:value-of select="edition"></xsl:value-of>
								</td>
								<td>
									<xsl:value-of select="price"></xsl:value-of>
								</td>
							</tr>
						</xsl:for-each>
					</table>
				</body>
			</center>
		</html>
	</xsl:template>
</xsl:stylesheet>