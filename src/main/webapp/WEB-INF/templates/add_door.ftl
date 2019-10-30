<#include "main-template.ftl"/>

<#macro content>
<form name="door" action="/add_door" method="post">
    <p>indicatorName</p>
    <input title="indicatorName" type="text" name="doorLightIndicator.indicatorName">
    <p>indicatorValue</p>
    <input title="indicatorValue" type="text" name="doorLightIndicator.indicatorValue">
    <p>isDoorOpen</p>
    <input title="isDoorOpen" type="text" name="isDoorOpen">
    <p> </p>
    <input type="submit" value="OK">
</form>
</#macro>

<@main title="Add door"/>