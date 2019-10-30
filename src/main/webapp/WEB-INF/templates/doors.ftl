<#include "main-template.ftl"/>

<#macro content>
    <#if doors?has_content>
        <ul>
            <#list doors as door>
                <li>${door.id} ${door.doorLightIndicator.indicatorName} ${door.doorLightIndicator.indicatorValue} ${door.isDoorOpen} </li>
            </#list>
        </ul>
    <#else>
        <p>No doors yet</p>
    </#if>

</#macro>

<@main title="Doors"/>
