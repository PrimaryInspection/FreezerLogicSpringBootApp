<#include "main-template.ftl"/>

<#assign sf=JspTaglibs["http://www.springframework.org/tags/form"]>

<#macro content>
    <@sf.form action="/add_door" method="post" modelAttribute="door">
       <div>
            <@sf.label path="id">id</@sf.label>
            <@sf.input path="id"/>
       </div>
        <div>
            <@sf.label path="doorLightIndicator.indicatorName">indicatorName</@sf.label>
            <@sf.input path="indicatorName"/>
        </div>
        <div>
            <@sf.label path="doorLightIndicator.indicatorValue">indicatorValue</@sf.label>
            <@sf.input path="indicatorValue"/>
        </div>
        <div>
            <@sf.label path="isDoorOpen">isDoorOpen</@sf.label>
            <@sf.input path="isDoorOpen" />
        </div>
        <input type="submit">
    </@sf.form>
    <#if error??>
        <p>Bad credentials</p>
    </#if>

</#macro>

<@main title="Add door"/>