(window["webpackJsonp"]=window["webpackJsonp"]||[]).push([["chunk-72b561ea"],{4765:function(e,t,a){"use strict";a.d(t,"a",(function(){return r}));var i=a("d4ec"),n=a("bee2"),r=function(){function e(){var t=arguments.length>0&&void 0!==arguments[0]?arguments[0]:{};Object(i["a"])(this,e),this.$store=null,this.$store=t.$store}return Object(n["a"])(e,[{key:"getStore",value:function(){return this.$store}},{key:"getService",value:function(e){return window["uiServiceRegister"].getService(e)}}]),e}()},d2b5:function(e,t,a){"use strict";a.r(t);var i=a("d4ec"),n=a("99de"),r=a("7e84"),s=a("262e"),c=(a("99af"),a("4160"),a("4ec9"),a("d3b7"),a("3ca3"),a("159b"),a("ddb0"),a("96cf"),a("1da1")),p=a("bee2"),l=a("032b"),o=a("d257"),u=a("4765"),d=a("6c89"),w=function(e){function t(){var e,a=arguments.length>0&&void 0!==arguments[0]?arguments[0]:{};return Object(i["a"])(this,t),e=Object(n["a"])(this,Object(r["a"])(t).call(this,a)),e.isEnableWorkflow=!1,e.dataService=new d["default"],e.allViewMap=new Map,e.stateValue=0,e.stateField="",e.mainStateFields=[],e.allDeMainStateMap=new Map,e.initViewMap(),e.initDeMainStateMap(),e}return Object(s["a"])(t,e),Object(p["a"])(t,[{key:"initViewMap",value:function(){this.allViewMap.set(":",{viewname:"stopremindgridview",srfappde:"pimcontracts"}),this.allViewMap.set("MPICKUPVIEW:",{viewname:"mpickupview",srfappde:"pimcontracts"}),this.allViewMap.set(":",{viewname:"grcontracteditview",srfappde:"pimcontracts"}),this.allViewMap.set("PICKUPVIEW:",{viewname:"pickupview",srfappde:"pimcontracts"}),this.allViewMap.set("MDATAVIEW:",{viewname:"gridview",srfappde:"pimcontracts"}),this.allViewMap.set(":",{viewname:"wssgridview",srfappde:"pimcontracts"}),this.allViewMap.set(":",{viewname:"lwgridview",srfappde:"pimcontracts"}),this.allViewMap.set(":",{viewname:"grcontractgridview",srfappde:"pimcontracts"}),this.allViewMap.set(":",{viewname:"xygridview",srfappde:"pimcontracts"}),this.allViewMap.set(":",{viewname:"editview2",srfappde:"pimcontracts"}),this.allViewMap.set(":",{viewname:"ldeditview",srfappde:"pimcontracts"}),this.allViewMap.set(":",{viewname:"signremindgridview",srfappde:"pimcontracts"}),this.allViewMap.set(":",{viewname:"lweditview",srfappde:"pimcontracts"}),this.allViewMap.set(":",{viewname:"treeexpview",srfappde:"pimcontracts"}),this.allViewMap.set(":",{viewname:"reneweditview",srfappde:"pimcontracts"}),this.allViewMap.set(":",{viewname:"ylweditview",srfappde:"pimcontracts"}),this.allViewMap.set("REDIRECTVIEW:",{viewname:"redirectview",srfappde:"pimcontracts"}),this.allViewMap.set(":",{viewname:"pickupgridview",srfappde:"pimcontracts"}),this.allViewMap.set("EDITVIEW:",{viewname:"editview",srfappde:"pimcontracts"}),this.allViewMap.set(":",{viewname:"ydtxgridview9",srfappde:"pimcontracts"}),this.allViewMap.set(":",{viewname:"expiregridview",srfappde:"pimcontracts"}),this.allViewMap.set(":",{viewname:"stoptimeselecteditview",srfappde:"pimcontracts"}),this.allViewMap.set(":",{viewname:"xylweditview",srfappde:"pimcontracts"}),this.allViewMap.set(":",{viewname:"ldgridview",srfappde:"pimcontracts"})}},{key:"initDeMainStateMap",value:function(){}},{key:"PimContract_Renew",value:function(){var e=Object(c["a"])(regeneratorRuntime.mark((function e(t){var a,i=arguments;return regeneratorRuntime.wrap((function(e){while(1)switch(e.prev=e.next){case 0:i.length>1&&void 0!==i[1]?i[1]:{},i.length>2&&void 0!==i[2]?i[2]:{},i.length>3?i[3]:void 0,i.length>4?i[4]:void 0,a=i.length>5?i[5]:void 0,i.length>6?i[6]:void 0,a.$Notice.error({title:"错误",desc:"不支持单项数据"});case 7:case"end":return e.stop()}}),e)})));function t(t){return e.apply(this,arguments)}return t}()},{key:"PimContract_StopContract",value:function(){var e=Object(c["a"])(regeneratorRuntime.mark((function e(t){var a,i,n,r,s,c,p,l,u,d,w,h,v,m,f,g=arguments;return regeneratorRuntime.wrap((function(e){while(1)switch(e.prev=e.next){case 0:a=g.length>1&&void 0!==g[1]?g[1]:{},i=g.length>2&&void 0!==g[2]?g[2]:{},g.length>3?g[3]:void 0,n=g.length>4?g[4]:void 0,r=g.length>5?g[5]:void 0,s=g.length>6?g[6]:void 0,c={},p={},l={},u=r,d=o["h"].deepCopy(t),w="SINGLEKEY",Object.assign(a,{pimcontract:"%pimcontract%"}),Object.assign(i,{pimcontractid:"%pimcontract%"}),Object.assign(i,{pimpersonname:"%pimpersonname%"}),u.context&&(p=u.context),u.viewparams&&(l=u.viewparams),a=o["g"].handleContextParam(w,d,p,l,a),c=o["g"].handleActionParam(w,d,p,l,i),a=Object.assign({},r.context,a),h={srfparentdename:s||null,srfparentkey:s?a[s.toLowerCase()]:null},Object.assign(c,h),Object.assign(a,h),v=[],a.pimperson&&(v=[{pathName:"pimpeople",parameterName:"pimperson"}]),m=[{pathName:"pimcontracts",parameterName:"pimcontract"},{pathName:"stoptimeselecteditview",parameterName:"stoptimeselecteditview"}],f=function(e){var i=r.$viewTool.buildUpRoutePath(r.$route,a,v,m,d,e);return r.$router.push(i),n&&n.refresh&&n.refresh instanceof Function&&n.refresh(t),null},f(c);case 28:case"end":return e.stop()}}),e)})));function t(t){return e.apply(this,arguments)}return t}()},{key:"PimContract_Signnew",value:function(){var e=Object(c["a"])(regeneratorRuntime.mark((function e(t){var a,i=arguments;return regeneratorRuntime.wrap((function(e){while(1)switch(e.prev=e.next){case 0:i.length>1&&void 0!==i[1]?i[1]:{},i.length>2&&void 0!==i[2]?i[2]:{},i.length>3?i[3]:void 0,i.length>4?i[4]:void 0,a=i.length>5?i[5]:void 0,i.length>6?i[6]:void 0,a.$Notice.error({title:"错误",desc:"不支持单项数据"});case 7:case"end":return e.stop()}}),e)})));function t(t){return e.apply(this,arguments)}return t}()},{key:"getRDAppView",value:function(){var e=Object(c["a"])(regeneratorRuntime.mark((function e(t,a){var i,n,r,s,c;return regeneratorRuntime.wrap((function(e){while(1)switch(e.prev=e.next){case 0:return this.isEnableWorkflow=a,e.next=3,this.dataService.Get({pimcontract:t});case 3:if(i=e.sent,n=i.data,!0,r=!1,s=!1,!this.isEnableWorkflow){e.next=17;break}return e.next=11,this.dataService.testDataInWF({stateValue:this.stateValue,stateField:this.stateField},n);case 11:if(r=e.sent,!r){e.next=17;break}return r=!0,e.next=16,this.dataService.testUserExistWorklist(null,n);case 16:s=e.sent;case 17:return e.next=19,this.getDESDDEViewPDTParam(n,r,s);case 19:return c=e.sent,e.abrupt("return",this.allViewMap.get(c));case 21:case"end":return e.stop()}}),e,this)})));function t(t,a){return e.apply(this,arguments)}return t}()},{key:"getRealDEType",value:function(e){}},{key:"getDESDDEViewPDTParam",value:function(){var e=Object(c["a"])(regeneratorRuntime.mark((function e(t,a,i){var n,r,s;return regeneratorRuntime.wrap((function(e){while(1)switch(e.prev=e.next){case 0:if("",n=!1,r=null,!n||!r){e.next=9;break}if(s=t[r],l["a"].isAppMode){e.next=8;break}return e.abrupt("return","MOBEDITVIEW"+s);case 8:return e.abrupt("return","EDITVIEW"+s);case 9:if(l["a"].isAppMode){e.next=17;break}if(!this.getDEMainStateTag(t)){e.next=16;break}return e.t0="MOBEDITVIEW:MSTAG:",e.next=14,this.getDEMainStateTag(t);case 14:return e.t1=e.sent,e.abrupt("return",e.t0.concat.call(e.t0,e.t1));case 16:return e.abrupt("return","MOBEDITVIEW:");case 17:if(!this.getDEMainStateTag(t)){e.next=23;break}return e.t2="EDITVIEW:MSTAG:",e.next=21,this.getDEMainStateTag(t);case 21:return e.t3=e.sent,e.abrupt("return",e.t2.concat.call(e.t2,e.t3));case 23:return e.abrupt("return","EDITVIEW:");case 24:case"end":return e.stop()}}),e,this)})));function t(t,a,i){return e.apply(this,arguments)}return t}()},{key:"getDEMainStateTag",value:function(){var e=Object(c["a"])(regeneratorRuntime.mark((function e(t){var a,i,n,r,s,c;return regeneratorRuntime.wrap((function(e){while(1)switch(e.prev=e.next){case 0:if(0!==this.mainStateFields.length){e.next=2;break}return e.abrupt("return",null);case 2:this.mainStateFields.forEach((function(e){e in t||console.error("当前数据对象不包含属性singleMainField，可能会发生错误")})),"",a=0;case 5:if(!(a<=1)){e.next=31;break}if(i=t[this.mainStateFields[0]]&&0==a?t[this.mainStateFields[0]]:"",!(this.mainStateFields.length>=2)){e.next=27;break}n=0;case 9:if(!(n<=1)){e.next=25;break}if(r=t[this.mainStateFields[1]]?"".concat(i,"__").concat(0==n?t[this.mainStateFields[1]]:""):i,!(this.mainStateFields.length>=3)){e.next=21;break}s=0;case 13:if(!(s<=1)){e.next=19;break}return c=t[this.mainStateFields[2]]?"".concat(r,"__").concat(0==s?t[this.mainStateFields[2]]:""):r,e.abrupt("return",this.allDeMainStateMap.get(c));case 16:s++,e.next=13;break;case 19:e.next=22;break;case 21:return e.abrupt("return",this.allDeMainStateMap.get(r));case 22:n++,e.next=9;break;case 25:e.next=28;break;case 27:return e.abrupt("return",this.allDeMainStateMap.get(i));case 28:a++,e.next=5;break;case 31:return e.abrupt("return",null);case 32:case"end":return e.stop()}}),e,this)})));function t(t){return e.apply(this,arguments)}return t}()}]),t}(u["a"]);a.d(t,"default",(function(){return h}));var h=function(e){function t(){var e=arguments.length>0&&void 0!==arguments[0]?arguments[0]:{};return Object(i["a"])(this,t),Object(n["a"])(this,Object(r["a"])(t).call(this,e))}return Object(s["a"])(t,e),t}(w)}}]);