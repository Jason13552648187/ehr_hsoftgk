(window["webpackJsonp"]=window["webpackJsonp"]||[]).push([["chunk-2c12cadd"],{4765:function(e,t,a){"use strict";a.d(t,"a",(function(){return r}));var i=a("d4ec"),n=a("bee2"),r=function(){function e(){var t=arguments.length>0&&void 0!==arguments[0]?arguments[0]:{};Object(i["a"])(this,e),this.$store=null,this.$store=t.$store}return Object(n["a"])(e,[{key:"getStore",value:function(){return this.$store}},{key:"getService",value:function(e){return window["uiServiceRegister"].getService(e)}}]),e}()},"72a4":function(e,t,a){"use strict";a.r(t);var i=a("d4ec"),n=a("99de"),r=a("7e84"),s=a("262e"),u=(a("99af"),a("4160"),a("4ec9"),a("d3b7"),a("3ca3"),a("159b"),a("ddb0"),a("96cf"),a("1da1")),c=a("bee2"),l=a("032b"),p=a("4765"),h=a("1e38"),o=function(e){function t(){var e,a=arguments.length>0&&void 0!==arguments[0]?arguments[0]:{};return Object(i["a"])(this,t),e=Object(n["a"])(this,Object(r["a"])(t).call(this,a)),e.isEnableWorkflow=!1,e.dataService=new h["default"],e.allViewMap=new Map,e.stateValue=0,e.stateField="",e.mainStateFields=[],e.allDeMainStateMap=new Map,e.initViewMap(),e.initDeMainStateMap(),e}return Object(s["a"])(t,e),Object(c["a"])(t,[{key:"initViewMap",value:function(){this.allViewMap.set("MDATAVIEW:",{viewname:"gridview",srfappde:"pimtitles"}),this.allViewMap.set(":",{viewname:"wsseditview",srfappde:"pimtitles"}),this.allViewMap.set(":",{viewname:"zyjszwgridview",srfappde:"pimtitles"}),this.allViewMap.set("MPICKUPVIEW:",{viewname:"mpickupview",srfappde:"pimtitles"}),this.allViewMap.set(":",{viewname:"greditview",srfappde:"pimtitles"}),this.allViewMap.set(":",{viewname:"grpimzhicgridview",srfappde:"pimtitles"}),this.allViewMap.set(":",{viewname:"pimzhicgridview",srfappde:"pimtitles"}),this.allViewMap.set("EDITVIEW:",{viewname:"editview",srfappde:"pimtitles"}),this.allViewMap.set(":",{viewname:"editview2",srfappde:"pimtitles"}),this.allViewMap.set("PICKUPVIEW:",{viewname:"pickupview",srfappde:"pimtitles"}),this.allViewMap.set(":",{viewname:"pickupgridview",srfappde:"pimtitles"}),this.allViewMap.set("REDIRECTVIEW:",{viewname:"redirectview",srfappde:"pimtitles"})}},{key:"initDeMainStateMap",value:function(){}},{key:"getRDAppView",value:function(){var e=Object(u["a"])(regeneratorRuntime.mark((function e(t,a){var i,n,r,s,u;return regeneratorRuntime.wrap((function(e){while(1)switch(e.prev=e.next){case 0:return this.isEnableWorkflow=a,e.next=3,this.dataService.Get({pimtitle:t});case 3:if(i=e.sent,n=i.data,!0,r=!1,s=!1,!this.isEnableWorkflow){e.next=17;break}return e.next=11,this.dataService.testDataInWF({stateValue:this.stateValue,stateField:this.stateField},n);case 11:if(r=e.sent,!r){e.next=17;break}return r=!0,e.next=16,this.dataService.testUserExistWorklist(null,n);case 16:s=e.sent;case 17:return e.next=19,this.getDESDDEViewPDTParam(n,r,s);case 19:return u=e.sent,e.abrupt("return",this.allViewMap.get(u));case 21:case"end":return e.stop()}}),e,this)})));function t(t,a){return e.apply(this,arguments)}return t}()},{key:"getRealDEType",value:function(e){}},{key:"getDESDDEViewPDTParam",value:function(){var e=Object(u["a"])(regeneratorRuntime.mark((function e(t,a,i){var n,r,s;return regeneratorRuntime.wrap((function(e){while(1)switch(e.prev=e.next){case 0:if("",n=!1,r=null,!n||!r){e.next=9;break}if(s=t[r],l["a"].isAppMode){e.next=8;break}return e.abrupt("return","MOBEDITVIEW"+s);case 8:return e.abrupt("return","EDITVIEW"+s);case 9:if(l["a"].isAppMode){e.next=17;break}if(!this.getDEMainStateTag(t)){e.next=16;break}return e.t0="MOBEDITVIEW:MSTAG:",e.next=14,this.getDEMainStateTag(t);case 14:return e.t1=e.sent,e.abrupt("return",e.t0.concat.call(e.t0,e.t1));case 16:return e.abrupt("return","MOBEDITVIEW:");case 17:if(!this.getDEMainStateTag(t)){e.next=23;break}return e.t2="EDITVIEW:MSTAG:",e.next=21,this.getDEMainStateTag(t);case 21:return e.t3=e.sent,e.abrupt("return",e.t2.concat.call(e.t2,e.t3));case 23:return e.abrupt("return","EDITVIEW:");case 24:case"end":return e.stop()}}),e,this)})));function t(t,a,i){return e.apply(this,arguments)}return t}()},{key:"getDEMainStateTag",value:function(){var e=Object(u["a"])(regeneratorRuntime.mark((function e(t){var a,i,n,r,s,u;return regeneratorRuntime.wrap((function(e){while(1)switch(e.prev=e.next){case 0:if(0!==this.mainStateFields.length){e.next=2;break}return e.abrupt("return",null);case 2:this.mainStateFields.forEach((function(e){e in t||console.error("当前数据对象不包含属性singleMainField，可能会发生错误")})),"",a=0;case 5:if(!(a<=1)){e.next=31;break}if(i=t[this.mainStateFields[0]]&&0==a?t[this.mainStateFields[0]]:"",!(this.mainStateFields.length>=2)){e.next=27;break}n=0;case 9:if(!(n<=1)){e.next=25;break}if(r=t[this.mainStateFields[1]]?"".concat(i,"__").concat(0==n?t[this.mainStateFields[1]]:""):i,!(this.mainStateFields.length>=3)){e.next=21;break}s=0;case 13:if(!(s<=1)){e.next=19;break}return u=t[this.mainStateFields[2]]?"".concat(r,"__").concat(0==s?t[this.mainStateFields[2]]:""):r,e.abrupt("return",this.allDeMainStateMap.get(u));case 16:s++,e.next=13;break;case 19:e.next=22;break;case 21:return e.abrupt("return",this.allDeMainStateMap.get(r));case 22:n++,e.next=9;break;case 25:e.next=28;break;case 27:return e.abrupt("return",this.allDeMainStateMap.get(i));case 28:a++,e.next=5;break;case 31:return e.abrupt("return",null);case 32:case"end":return e.stop()}}),e,this)})));function t(t){return e.apply(this,arguments)}return t}()}]),t}(p["a"]);a.d(t,"default",(function(){return w}));var w=function(e){function t(){var e=arguments.length>0&&void 0!==arguments[0]?arguments[0]:{};return Object(i["a"])(this,t),Object(n["a"])(this,Object(r["a"])(t).call(this,e))}return Object(s["a"])(t,e),t}(o)}}]);