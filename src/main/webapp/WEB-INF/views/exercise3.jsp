<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Currency Exchange</title>
</head>
<body>
    <form action="currency_exchange" method="get">
        <fieldset>
            <legend>USD to VND</legend>
            <label>
                USD
                <input type="number" name="usd" value="${usd}" step="any">
            </label>
            <label>
                <button type="submit">Calculate</button>
            </label>
            <p>VND: ${vnd}</p>
        </fieldset>
    </form>
</body>
</html>
