(window["webpackJsonp"]=window["webpackJsonp"]||[]).push([["chunk-7465d912"],{"307d2":function(e,r,t){"use strict";t.r(r);var n=t("d4ec"),a=t("99de"),c=t("7e84"),i=t("262e"),s=(t("99af"),t("96cf"),t("1da1")),u=t("bee2"),p=t("d257"),o=t("ce95"),m=function(e){function r(){var e=arguments.length>0&&void 0!==arguments[0]?arguments[0]:{};return Object(n["a"])(this,r),Object(a["a"])(this,Object(c["a"])(r).call(this,e))}return Object(i["a"])(r,e),Object(u["a"])(r,[{key:"initBasicData",value:function(){this.APPLYDEKEY="pimarmycadres",this.APPDEKEY="pimarmycadresid",this.APPDENAME="pimarmycadres",this.APPDETEXT="pimarmycadresname",this.APPNAME="ehrpim",this.SYSTEMNAME="ehr"}},{key:"Select",value:function(){var e=Object(s["a"])(regeneratorRuntime.mark((function e(){var r,t,n=arguments;return regeneratorRuntime.wrap((function(e){while(1)switch(e.prev=e.next){case 0:if(r=n.length>0&&void 0!==n[0]?n[0]:{},n.length>1&&void 0!==n[1]?n[1]:{},t=n.length>2?n[2]:void 0,!r.pimperson||!r.pimarmycadres){e.next=5;break}return e.abrupt("return",p["c"].getInstance().get("/pimpeople/".concat(r.pimperson,"/pimarmycadres/").concat(r.pimarmycadres,"/select"),t));case 5:return e.abrupt("return",p["c"].getInstance().get("/pimarmycadres/".concat(r.pimarmycadres,"/select"),t));case 6:case"end":return e.stop()}}),e)})));function r(){return e.apply(this,arguments)}return r}()},{key:"Remove",value:function(){var e=Object(s["a"])(regeneratorRuntime.mark((function e(){var r,t,n=arguments;return regeneratorRuntime.wrap((function(e){while(1)switch(e.prev=e.next){case 0:if(r=n.length>0&&void 0!==n[0]?n[0]:{},n.length>1&&void 0!==n[1]?n[1]:{},t=n.length>2?n[2]:void 0,!r.pimperson||!r.pimarmycadres){e.next=5;break}return e.abrupt("return",p["c"].getInstance()["delete"]("/pimpeople/".concat(r.pimperson,"/pimarmycadres/").concat(r.pimarmycadres),t));case 5:return e.abrupt("return",p["c"].getInstance()["delete"]("/pimarmycadres/".concat(r.pimarmycadres),t));case 6:case"end":return e.stop()}}),e)})));function r(){return e.apply(this,arguments)}return r}()},{key:"GetDraft",value:function(){var e=Object(s["a"])(regeneratorRuntime.mark((function e(){var r,t,n,a,c=arguments;return regeneratorRuntime.wrap((function(e){while(1)switch(e.prev=e.next){case 0:if(r=c.length>0&&void 0!==c[0]?c[0]:{},t=c.length>1&&void 0!==c[1]?c[1]:{},n=c.length>2?c[2]:void 0,!r.pimperson){e.next=5;break}return e.abrupt("return",p["c"].getInstance().get("/pimpeople/".concat(r.pimperson,"/pimarmycadres/getdraft"),n));case 5:return e.next=7,p["c"].getInstance().get("/pimarmycadres/getdraft",n);case 7:return a=e.sent,a.data.pimarmycadres=t.pimarmycadres,e.abrupt("return",a);case 10:case"end":return e.stop()}}),e)})));function r(){return e.apply(this,arguments)}return r}()},{key:"CheckKey",value:function(){var e=Object(s["a"])(regeneratorRuntime.mark((function e(){var r,t,n,a=arguments;return regeneratorRuntime.wrap((function(e){while(1)switch(e.prev=e.next){case 0:if(r=a.length>0&&void 0!==a[0]?a[0]:{},t=a.length>1&&void 0!==a[1]?a[1]:{},n=a.length>2?a[2]:void 0,!r.pimperson||!r.pimarmycadres){e.next=5;break}return e.abrupt("return",p["c"].getInstance().post("/pimpeople/".concat(r.pimperson,"/pimarmycadres/").concat(r.pimarmycadres,"/checkkey"),t,n));case 5:return e.abrupt("return",p["c"].getInstance().post("/pimarmycadres/".concat(r.pimarmycadres,"/checkkey"),t,n));case 6:case"end":return e.stop()}}),e)})));function r(){return e.apply(this,arguments)}return r}()},{key:"Create",value:function(){var e=Object(s["a"])(regeneratorRuntime.mark((function e(){var r,t,n,a,c,i=arguments;return regeneratorRuntime.wrap((function(e){while(1)switch(e.prev=e.next){case 0:if(r=i.length>0&&void 0!==i[0]?i[0]:{},t=i.length>1&&void 0!==i[1]?i[1]:{},n=i.length>2?i[2]:void 0,!r.pimperson){e.next=7;break}return t.srffrontuf&&"1"===t.srffrontuf||(t[this.APPDEKEY]=null),t.srffrontuf&&delete t.srffrontuf,e.abrupt("return",p["c"].getInstance().post("/pimpeople/".concat(r.pimperson,"/pimarmycadres"),t,n));case 7:return a={},Object.assign(t,a),t.srffrontuf&&"1"===t.srffrontuf||(t[this.APPDEKEY]=null),t.srffrontuf&&delete t.srffrontuf,JSON.parse(JSON.stringify(r)),e.next=14,p["c"].getInstance().post("/pimarmycadres",t,n);case 14:return c=e.sent,e.abrupt("return",c);case 16:case"end":return e.stop()}}),e,this)})));function r(){return e.apply(this,arguments)}return r}()},{key:"Update",value:function(){var e=Object(s["a"])(regeneratorRuntime.mark((function e(){var r,t,n,a,c,i=arguments;return regeneratorRuntime.wrap((function(e){while(1)switch(e.prev=e.next){case 0:if(r=i.length>0&&void 0!==i[0]?i[0]:{},t=i.length>1&&void 0!==i[1]?i[1]:{},n=i.length>2?i[2]:void 0,!r.pimperson||!r.pimarmycadres){e.next=5;break}return e.abrupt("return",p["c"].getInstance().put("/pimpeople/".concat(r.pimperson,"/pimarmycadres/").concat(r.pimarmycadres),t,n));case 5:return a={},Object.assign(t,a),e.next=9,p["c"].getInstance().put("/pimarmycadres/".concat(r.pimarmycadres),t,n);case 9:return c=e.sent,e.abrupt("return",c);case 11:case"end":return e.stop()}}),e)})));function r(){return e.apply(this,arguments)}return r}()},{key:"Get",value:function(){var e=Object(s["a"])(regeneratorRuntime.mark((function e(){var r,t,n,a=arguments;return regeneratorRuntime.wrap((function(e){while(1)switch(e.prev=e.next){case 0:if(r=a.length>0&&void 0!==a[0]?a[0]:{},a.length>1&&void 0!==a[1]?a[1]:{},t=a.length>2?a[2]:void 0,!r.pimperson||!r.pimarmycadres){e.next=5;break}return e.abrupt("return",p["c"].getInstance().get("/pimpeople/".concat(r.pimperson,"/pimarmycadres/").concat(r.pimarmycadres),t));case 5:return e.next=7,p["c"].getInstance().get("/pimarmycadres/".concat(r.pimarmycadres),t);case 7:return n=e.sent,e.abrupt("return",n);case 9:case"end":return e.stop()}}),e)})));function r(){return e.apply(this,arguments)}return r}()},{key:"Save",value:function(){var e=Object(s["a"])(regeneratorRuntime.mark((function e(){var r,t,n,a,c,i=arguments;return regeneratorRuntime.wrap((function(e){while(1)switch(e.prev=e.next){case 0:if(r=i.length>0&&void 0!==i[0]?i[0]:{},t=i.length>1&&void 0!==i[1]?i[1]:{},n=i.length>2?i[2]:void 0,!r.pimperson||!r.pimarmycadres){e.next=5;break}return e.abrupt("return",p["c"].getInstance().post("/pimpeople/".concat(r.pimperson,"/pimarmycadres/").concat(r.pimarmycadres,"/save"),t,n));case 5:return a={},Object.assign(t,a),e.next=9,p["c"].getInstance().post("/pimarmycadres/".concat(r.pimarmycadres,"/save"),t,n);case 9:return c=e.sent,e.abrupt("return",c);case 11:case"end":return e.stop()}}),e)})));function r(){return e.apply(this,arguments)}return r}()},{key:"FetchDefault",value:function(){var e=Object(s["a"])(regeneratorRuntime.mark((function e(){var r,t,n,a,c,i=arguments;return regeneratorRuntime.wrap((function(e){while(1)switch(e.prev=e.next){case 0:if(r=i.length>0&&void 0!==i[0]?i[0]:{},t=i.length>1&&void 0!==i[1]?i[1]:{},n=i.length>2?i[2]:void 0,!r.pimperson){e.next=6;break}return a=JSON.parse(JSON.stringify(t)),e.abrupt("return",p["c"].getInstance().get("/pimpeople/".concat(r.pimperson,"/pimarmycadres/fetchdefault"),a,n));case 6:return c=JSON.parse(JSON.stringify(t)),e.abrupt("return",p["c"].getInstance().get("/pimarmycadres/fetchdefault",c,n));case 8:case"end":return e.stop()}}),e)})));function r(){return e.apply(this,arguments)}return r}()},{key:"FetchJLSSGLY",value:function(){var e=Object(s["a"])(regeneratorRuntime.mark((function e(){var r,t,n,a,c,i=arguments;return regeneratorRuntime.wrap((function(e){while(1)switch(e.prev=e.next){case 0:if(r=i.length>0&&void 0!==i[0]?i[0]:{},t=i.length>1&&void 0!==i[1]?i[1]:{},n=i.length>2?i[2]:void 0,!r.pimperson){e.next=6;break}return a=JSON.parse(JSON.stringify(t)),e.abrupt("return",p["c"].getInstance().get("/pimpeople/".concat(r.pimperson,"/pimarmycadres/fetchjlssgly"),a,n));case 6:return c=JSON.parse(JSON.stringify(t)),e.abrupt("return",p["c"].getInstance().get("/pimarmycadres/fetchjlssgly",c,n));case 8:case"end":return e.stop()}}),e)})));function r(){return e.apply(this,arguments)}return r}()},{key:"FetchJLSSGR",value:function(){var e=Object(s["a"])(regeneratorRuntime.mark((function e(){var r,t,n,a,c,i=arguments;return regeneratorRuntime.wrap((function(e){while(1)switch(e.prev=e.next){case 0:if(r=i.length>0&&void 0!==i[0]?i[0]:{},t=i.length>1&&void 0!==i[1]?i[1]:{},n=i.length>2?i[2]:void 0,!r.pimperson){e.next=6;break}return a=JSON.parse(JSON.stringify(t)),e.abrupt("return",p["c"].getInstance().get("/pimpeople/".concat(r.pimperson,"/pimarmycadres/fetchjlssgr"),a,n));case 6:return c=JSON.parse(JSON.stringify(t)),e.abrupt("return",p["c"].getInstance().get("/pimarmycadres/fetchjlssgr",c,n));case 8:case"end":return e.stop()}}),e)})));function r(){return e.apply(this,arguments)}return r}()}]),r}(o["a"]);t.d(r,"default",(function(){return d}));var d=function(e){function r(){var e=arguments.length>0&&void 0!==arguments[0]?arguments[0]:{};return Object(n["a"])(this,r),Object(a["a"])(this,Object(c["a"])(r).call(this,e))}return Object(i["a"])(r,e),r}(m)}}]);