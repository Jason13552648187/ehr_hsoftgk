(window["webpackJsonp"]=window["webpackJsonp"]||[]).push([["chunk-2d0a389f"],{"0339":function(e,r,t){"use strict";t.r(r);var n=t("d4ec"),a=t("99de"),c=t("7e84"),i=t("262e"),s=(t("99af"),t("96cf"),t("1da1")),p=t("bee2"),h=t("d257"),u=t("ce95"),o=function(e){function r(){var e=arguments.length>0&&void 0!==arguments[0]?arguments[0]:{};return Object(n["a"])(this,r),Object(a["a"])(this,Object(c["a"])(r).call(this,e))}return Object(i["a"])(r,e),Object(p["a"])(r,[{key:"initBasicData",value:function(){this.APPLYDEKEY="pimarchiveschange",this.APPDEKEY="pimarchiveschangeid",this.APPDENAME="pimarchiveschanges",this.APPDETEXT="pimarchiveschangename",this.APPNAME="ehrpim",this.SYSTEMNAME="ehr"}},{key:"Select",value:function(){var e=Object(s["a"])(regeneratorRuntime.mark((function e(){var r,t,n=arguments;return regeneratorRuntime.wrap((function(e){while(1)switch(e.prev=e.next){case 0:if(r=n.length>0&&void 0!==n[0]?n[0]:{},n.length>1&&void 0!==n[1]?n[1]:{},t=n.length>2?n[2]:void 0,!(r.pimperson&&r.pimarchives&&r.pimarchiveschange)){e.next=5;break}return e.abrupt("return",h["c"].getInstance().get("/pimpeople/".concat(r.pimperson,"/pimarchives/").concat(r.pimarchives,"/pimarchiveschanges/").concat(r.pimarchiveschange,"/select"),t));case 5:if(!r.pimarchives||!r.pimarchiveschange){e.next=7;break}return e.abrupt("return",h["c"].getInstance().get("/pimarchives/".concat(r.pimarchives,"/pimarchiveschanges/").concat(r.pimarchiveschange,"/select"),t));case 7:return e.abrupt("return",h["c"].getInstance().get("/pimarchiveschanges/".concat(r.pimarchiveschange,"/select"),t));case 8:case"end":return e.stop()}}),e)})));function r(){return e.apply(this,arguments)}return r}()},{key:"Update",value:function(){var e=Object(s["a"])(regeneratorRuntime.mark((function e(){var r,t,n,a,c,i=arguments;return regeneratorRuntime.wrap((function(e){while(1)switch(e.prev=e.next){case 0:if(r=i.length>0&&void 0!==i[0]?i[0]:{},t=i.length>1&&void 0!==i[1]?i[1]:{},n=i.length>2?i[2]:void 0,!(r.pimperson&&r.pimarchives&&r.pimarchiveschange)){e.next=5;break}return e.abrupt("return",h["c"].getInstance().put("/pimpeople/".concat(r.pimperson,"/pimarchives/").concat(r.pimarchives,"/pimarchiveschanges/").concat(r.pimarchiveschange),t,n));case 5:if(!r.pimarchives||!r.pimarchiveschange){e.next=7;break}return e.abrupt("return",h["c"].getInstance().put("/pimarchives/".concat(r.pimarchives,"/pimarchiveschanges/").concat(r.pimarchiveschange),t,n));case 7:return a={},Object.assign(t,a),e.next=11,h["c"].getInstance().put("/pimarchiveschanges/".concat(r.pimarchiveschange),t,n);case 11:return c=e.sent,e.abrupt("return",c);case 13:case"end":return e.stop()}}),e)})));function r(){return e.apply(this,arguments)}return r}()},{key:"Get",value:function(){var e=Object(s["a"])(regeneratorRuntime.mark((function e(){var r,t,n,a=arguments;return regeneratorRuntime.wrap((function(e){while(1)switch(e.prev=e.next){case 0:if(r=a.length>0&&void 0!==a[0]?a[0]:{},a.length>1&&void 0!==a[1]?a[1]:{},t=a.length>2?a[2]:void 0,!(r.pimperson&&r.pimarchives&&r.pimarchiveschange)){e.next=5;break}return e.abrupt("return",h["c"].getInstance().get("/pimpeople/".concat(r.pimperson,"/pimarchives/").concat(r.pimarchives,"/pimarchiveschanges/").concat(r.pimarchiveschange),t));case 5:if(!r.pimarchives||!r.pimarchiveschange){e.next=7;break}return e.abrupt("return",h["c"].getInstance().get("/pimarchives/".concat(r.pimarchives,"/pimarchiveschanges/").concat(r.pimarchiveschange),t));case 7:return e.next=9,h["c"].getInstance().get("/pimarchiveschanges/".concat(r.pimarchiveschange),t);case 9:return n=e.sent,e.abrupt("return",n);case 11:case"end":return e.stop()}}),e)})));function r(){return e.apply(this,arguments)}return r}()},{key:"Create",value:function(){var e=Object(s["a"])(regeneratorRuntime.mark((function e(){var r,t,n,a,c,i=arguments;return regeneratorRuntime.wrap((function(e){while(1)switch(e.prev=e.next){case 0:if(r=i.length>0&&void 0!==i[0]?i[0]:{},t=i.length>1&&void 0!==i[1]?i[1]:{},n=i.length>2?i[2]:void 0,!r.pimperson||!r.pimarchives){e.next=7;break}return t.srffrontuf&&"1"===t.srffrontuf||(t[this.APPDEKEY]=null),t.srffrontuf&&delete t.srffrontuf,e.abrupt("return",h["c"].getInstance().post("/pimpeople/".concat(r.pimperson,"/pimarchives/").concat(r.pimarchives,"/pimarchiveschanges"),t,n));case 7:if(!r.pimarchives){e.next=11;break}return t.srffrontuf&&"1"===t.srffrontuf||(t[this.APPDEKEY]=null),t.srffrontuf&&delete t.srffrontuf,e.abrupt("return",h["c"].getInstance().post("/pimarchives/".concat(r.pimarchives,"/pimarchiveschanges"),t,n));case 11:return a={},Object.assign(t,a),t.srffrontuf&&"1"===t.srffrontuf||(t[this.APPDEKEY]=null),t.srffrontuf&&delete t.srffrontuf,JSON.parse(JSON.stringify(r)),e.next=18,h["c"].getInstance().post("/pimarchiveschanges",t,n);case 18:return c=e.sent,e.abrupt("return",c);case 20:case"end":return e.stop()}}),e,this)})));function r(){return e.apply(this,arguments)}return r}()},{key:"GetDraft",value:function(){var e=Object(s["a"])(regeneratorRuntime.mark((function e(){var r,t,n,a,c=arguments;return regeneratorRuntime.wrap((function(e){while(1)switch(e.prev=e.next){case 0:if(r=c.length>0&&void 0!==c[0]?c[0]:{},t=c.length>1&&void 0!==c[1]?c[1]:{},n=c.length>2?c[2]:void 0,!r.pimperson||!r.pimarchives){e.next=5;break}return e.abrupt("return",h["c"].getInstance().get("/pimpeople/".concat(r.pimperson,"/pimarchives/").concat(r.pimarchives,"/pimarchiveschanges/getdraft"),n));case 5:if(!r.pimarchives){e.next=7;break}return e.abrupt("return",h["c"].getInstance().get("/pimarchives/".concat(r.pimarchives,"/pimarchiveschanges/getdraft"),n));case 7:return e.next=9,h["c"].getInstance().get("/pimarchiveschanges/getdraft",n);case 9:return a=e.sent,a.data.pimarchiveschange=t.pimarchiveschange,e.abrupt("return",a);case 12:case"end":return e.stop()}}),e)})));function r(){return e.apply(this,arguments)}return r}()},{key:"CheckKey",value:function(){var e=Object(s["a"])(regeneratorRuntime.mark((function e(){var r,t,n,a=arguments;return regeneratorRuntime.wrap((function(e){while(1)switch(e.prev=e.next){case 0:if(r=a.length>0&&void 0!==a[0]?a[0]:{},t=a.length>1&&void 0!==a[1]?a[1]:{},n=a.length>2?a[2]:void 0,!(r.pimperson&&r.pimarchives&&r.pimarchiveschange)){e.next=5;break}return e.abrupt("return",h["c"].getInstance().post("/pimpeople/".concat(r.pimperson,"/pimarchives/").concat(r.pimarchives,"/pimarchiveschanges/").concat(r.pimarchiveschange,"/checkkey"),t,n));case 5:if(!r.pimarchives||!r.pimarchiveschange){e.next=7;break}return e.abrupt("return",h["c"].getInstance().post("/pimarchives/".concat(r.pimarchives,"/pimarchiveschanges/").concat(r.pimarchiveschange,"/checkkey"),t,n));case 7:return e.abrupt("return",h["c"].getInstance().post("/pimarchiveschanges/".concat(r.pimarchiveschange,"/checkkey"),t,n));case 8:case"end":return e.stop()}}),e)})));function r(){return e.apply(this,arguments)}return r}()},{key:"UpdatePersonFile",value:function(){var e=Object(s["a"])(regeneratorRuntime.mark((function e(){var r,t,n,a=arguments;return regeneratorRuntime.wrap((function(e){while(1)switch(e.prev=e.next){case 0:if(r=a.length>0&&void 0!==a[0]?a[0]:{},t=a.length>1&&void 0!==a[1]?a[1]:{},n=a.length>2?a[2]:void 0,!(r.pimperson&&r.pimarchives&&r.pimarchiveschange)){e.next=5;break}return e.abrupt("return",h["c"].getInstance().put("/pimpeople/".concat(r.pimperson,"/pimarchives/").concat(r.pimarchives,"/pimarchiveschanges/").concat(r.pimarchiveschange,"/updatepersonfile"),t,n));case 5:if(!r.pimarchives||!r.pimarchiveschange){e.next=7;break}return e.abrupt("return",h["c"].getInstance().put("/pimarchives/".concat(r.pimarchives,"/pimarchiveschanges/").concat(r.pimarchiveschange,"/updatepersonfile"),t,n));case 7:return e.abrupt("return",h["c"].getInstance().put("/pimarchiveschanges/".concat(r.pimarchiveschange,"/updatepersonfile"),t,n));case 8:case"end":return e.stop()}}),e)})));function r(){return e.apply(this,arguments)}return r}()},{key:"Save",value:function(){var e=Object(s["a"])(regeneratorRuntime.mark((function e(){var r,t,n,a,c,i=arguments;return regeneratorRuntime.wrap((function(e){while(1)switch(e.prev=e.next){case 0:if(r=i.length>0&&void 0!==i[0]?i[0]:{},t=i.length>1&&void 0!==i[1]?i[1]:{},n=i.length>2?i[2]:void 0,!(r.pimperson&&r.pimarchives&&r.pimarchiveschange)){e.next=5;break}return e.abrupt("return",h["c"].getInstance().post("/pimpeople/".concat(r.pimperson,"/pimarchives/").concat(r.pimarchives,"/pimarchiveschanges/").concat(r.pimarchiveschange,"/save"),t,n));case 5:if(!r.pimarchives||!r.pimarchiveschange){e.next=7;break}return e.abrupt("return",h["c"].getInstance().post("/pimarchives/".concat(r.pimarchives,"/pimarchiveschanges/").concat(r.pimarchiveschange,"/save"),t,n));case 7:return a={},Object.assign(t,a),e.next=11,h["c"].getInstance().post("/pimarchiveschanges/".concat(r.pimarchiveschange,"/save"),t,n);case 11:return c=e.sent,e.abrupt("return",c);case 13:case"end":return e.stop()}}),e)})));function r(){return e.apply(this,arguments)}return r}()},{key:"Remove",value:function(){var e=Object(s["a"])(regeneratorRuntime.mark((function e(){var r,t,n=arguments;return regeneratorRuntime.wrap((function(e){while(1)switch(e.prev=e.next){case 0:if(r=n.length>0&&void 0!==n[0]?n[0]:{},n.length>1&&void 0!==n[1]?n[1]:{},t=n.length>2?n[2]:void 0,!(r.pimperson&&r.pimarchives&&r.pimarchiveschange)){e.next=5;break}return e.abrupt("return",h["c"].getInstance()["delete"]("/pimpeople/".concat(r.pimperson,"/pimarchives/").concat(r.pimarchives,"/pimarchiveschanges/").concat(r.pimarchiveschange),t));case 5:if(!r.pimarchives||!r.pimarchiveschange){e.next=7;break}return e.abrupt("return",h["c"].getInstance()["delete"]("/pimarchives/".concat(r.pimarchives,"/pimarchiveschanges/").concat(r.pimarchiveschange),t));case 7:return e.abrupt("return",h["c"].getInstance()["delete"]("/pimarchiveschanges/".concat(r.pimarchiveschange),t));case 8:case"end":return e.stop()}}),e)})));function r(){return e.apply(this,arguments)}return r}()},{key:"FetchDADCJL",value:function(){var e=Object(s["a"])(regeneratorRuntime.mark((function e(){var r,t,n,a,c,i,s=arguments;return regeneratorRuntime.wrap((function(e){while(1)switch(e.prev=e.next){case 0:if(r=s.length>0&&void 0!==s[0]?s[0]:{},t=s.length>1&&void 0!==s[1]?s[1]:{},n=s.length>2?s[2]:void 0,!r.pimperson||!r.pimarchives){e.next=6;break}return a=JSON.parse(JSON.stringify(t)),e.abrupt("return",h["c"].getInstance().get("/pimpeople/".concat(r.pimperson,"/pimarchives/").concat(r.pimarchives,"/pimarchiveschanges/fetchdadcjl"),a,n));case 6:if(!r.pimarchives){e.next=9;break}return c=JSON.parse(JSON.stringify(t)),e.abrupt("return",h["c"].getInstance().get("/pimarchives/".concat(r.pimarchives,"/pimarchiveschanges/fetchdadcjl"),c,n));case 9:return i=JSON.parse(JSON.stringify(t)),e.abrupt("return",h["c"].getInstance().get("/pimarchiveschanges/fetchdadcjl",i,n));case 11:case"end":return e.stop()}}),e)})));function r(){return e.apply(this,arguments)}return r}()},{key:"FetchDefault",value:function(){var e=Object(s["a"])(regeneratorRuntime.mark((function e(){var r,t,n,a,c,i,s=arguments;return regeneratorRuntime.wrap((function(e){while(1)switch(e.prev=e.next){case 0:if(r=s.length>0&&void 0!==s[0]?s[0]:{},t=s.length>1&&void 0!==s[1]?s[1]:{},n=s.length>2?s[2]:void 0,!r.pimperson||!r.pimarchives){e.next=6;break}return a=JSON.parse(JSON.stringify(t)),e.abrupt("return",h["c"].getInstance().get("/pimpeople/".concat(r.pimperson,"/pimarchives/").concat(r.pimarchives,"/pimarchiveschanges/fetchdefault"),a,n));case 6:if(!r.pimarchives){e.next=9;break}return c=JSON.parse(JSON.stringify(t)),e.abrupt("return",h["c"].getInstance().get("/pimarchives/".concat(r.pimarchives,"/pimarchiveschanges/fetchdefault"),c,n));case 9:return i=JSON.parse(JSON.stringify(t)),e.abrupt("return",h["c"].getInstance().get("/pimarchiveschanges/fetchdefault",i,n));case 11:case"end":return e.stop()}}),e)})));function r(){return e.apply(this,arguments)}return r}()}]),r}(u["a"]);t.d(r,"default",(function(){return v}));var v=function(e){function r(){var e=arguments.length>0&&void 0!==arguments[0]?arguments[0]:{};return Object(n["a"])(this,r),Object(a["a"])(this,Object(c["a"])(r).call(this,e))}return Object(i["a"])(r,e),r}(o)}}]);