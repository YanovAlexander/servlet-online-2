<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
    <head>
        <title>Book</title>
    </head>

    <body>
        <table>
            <thead>
            <tr>
                <td style="text-align: center">Book name</td>
                <td style="text-align: center">Book email</td>
                <td style="text-align: center">Publication year</td>
            </tr>
            </thead>
            <tbody>
                <c:forEach items="${books}" var="book">
                    <tr>
                        <td>
                            <c:out value="${book.name}"/>
                        </td>
                        <td>
                            <c:out value="${book.authorEmail}"/>
                        </td>
                        <td>
                            <c:out value="${book.publicationYear}"/>
                        </td>
                    </tr>
                </c:forEach>
            </tbody>
        </table>
    </body>
</html>
