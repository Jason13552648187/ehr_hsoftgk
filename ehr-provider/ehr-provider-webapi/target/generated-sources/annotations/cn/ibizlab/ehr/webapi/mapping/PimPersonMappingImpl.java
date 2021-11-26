package cn.ibizlab.ehr.webapi.mapping;

import cn.ibizlab.ehr.core.pim.domain.PimPerson;
import cn.ibizlab.ehr.webapi.dto.PimPersonDTO;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import javax.annotation.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2021-09-04T00:31:49+0800",
    comments = "version: 1.3.0.Final, compiler: javac, environment: Java 1.8.0_92 (Oracle Corporation)"
)
@Component
public class PimPersonMappingImpl implements PimPersonMapping {

    @Override
    public PimPerson toDomain(PimPersonDTO dto) {
        if ( dto == null ) {
            return null;
        }

        PimPerson pimPerson = new PimPerson();

        Set<String> set = dto.getFocusNull();
        if ( set != null ) {
            pimPerson.setFocusNull( new HashSet<String>( set ) );
        }
        Map<String, Object> map = dto.getExtensionparams();
        if ( map != null ) {
            pimPerson.setExtensionparams( new HashMap<String, Object>( map ) );
        }
        if ( dto.getGzzt() != null ) {
            pimPerson.setGzzt( dto.getGzzt() );
        }
        if ( dto.getZjlx() != null ) {
            pimPerson.setZjlx( dto.getZjlx() );
        }
        if ( dto.getZgzt() != null ) {
            pimPerson.setZgzt( dto.getZgzt() );
        }
        if ( dto.getGw() != null ) {
            pimPerson.setGw( dto.getGw() );
        }
        if ( dto.getYglx() != null ) {
            pimPerson.setYglx( dto.getYglx() );
        }
        if ( dto.getDaxl() != null ) {
            pimPerson.setDaxl( dto.getDaxl() );
        }
        if ( dto.getTransferdate() != null ) {
            pimPerson.setTransferdate( dto.getTransferdate() );
        }
        if ( dto.getAhtc() != null ) {
            pimPerson.setAhtc( dto.getAhtc() );
        }
        if ( dto.getRznldq() != null ) {
            pimPerson.setRznldq( dto.getRznldq() );
        }
        if ( dto.getPostaladdress() != null ) {
            pimPerson.setPostaladdress( dto.getPostaladdress() );
        }
        if ( dto.getSydq() != null ) {
            pimPerson.setSydq( dto.getSydq() );
        }
        if ( dto.getDzjbjsj() != null ) {
            pimPerson.setDzjbjsj( dto.getDzjbjsj() );
        }
        if ( dto.getJtlxrid() != null ) {
            pimPerson.setJtlxrid( dto.getJtlxrid() );
        }
        if ( dto.getPostexpiration() != null ) {
            pimPerson.setPostexpiration( dto.getPostexpiration() );
        }
        if ( dto.getJg() != null ) {
            pimPerson.setJg( dto.getJg() );
        }
        if ( dto.getRank() != null ) {
            pimPerson.setRank( dto.getRank() );
        }
        if ( dto.getGzzz() != null ) {
            pimPerson.setGzzz( dto.getGzzz() );
        }
        if ( dto.getSyczjrq() != null ) {
            pimPerson.setSyczjrq( dto.getSyczjrq() );
        }
        if ( dto.getHightitle() != null ) {
            pimPerson.setHightitle( dto.getHightitle() );
        }
        if ( dto.getGzkssj() != null ) {
            pimPerson.setGzkssj( dto.getGzkssj() );
        }
        if ( dto.getSpdylje() != null ) {
            pimPerson.setSpdylje( dto.getSpdylje() );
        }
        if ( dto.getYygbh() != null ) {
            pimPerson.setYygbh( dto.getYygbh() );
        }
        if ( dto.getJlss() != null ) {
            pimPerson.setJlss( dto.getJlss() );
        }
        if ( dto.getIsleaderteam() != null ) {
            pimPerson.setIsleaderteam( dto.getIsleaderteam() );
        }
        if ( dto.getHmd() != null ) {
            pimPerson.setHmd( dto.getHmd() );
        }
        if ( dto.getDacsrq() != null ) {
            pimPerson.setDacsrq( dto.getDacsrq() );
        }
        if ( dto.getJkzk() != null ) {
            pimPerson.setJkzk( dto.getJkzk() );
        }
        if ( dto.getGwzt() != null ) {
            pimPerson.setGwzt( dto.getGwzt() );
        }
        if ( dto.getDbdwsj() != null ) {
            pimPerson.setDbdwsj( dto.getDbdwsj() );
        }
        if ( dto.getZyzg() != null ) {
            pimPerson.setZyzg( dto.getZyzg() );
        }
        if ( dto.getCsd() != null ) {
            pimPerson.setCsd( dto.getCsd() );
        }
        if ( dto.getJtlxrdh() != null ) {
            pimPerson.setJtlxrdh( dto.getJtlxrdh() );
        }
        if ( dto.getDyxlbysj() != null ) {
            pimPerson.setDyxlbysj( dto.getDyxlbysj() );
        }
        if ( dto.getYgbh() != null ) {
            pimPerson.setYgbh( dto.getYgbh() );
        }
        if ( dto.getZjnx() != null ) {
            pimPerson.setZjnx( dto.getZjnx() );
        }
        if ( dto.getRzdq() != null ) {
            pimPerson.setRzdq( dto.getRzdq() );
        }
        if ( dto.getHjszd() != null ) {
            pimPerson.setHjszd( dto.getHjszd() );
        }
        if ( dto.getGzjssj() != null ) {
            pimPerson.setGzjssj( dto.getGzjssj() );
        }
        if ( dto.getSfnbfp() != null ) {
            pimPerson.setSfnbfp( dto.getSfnbfp() );
        }
        if ( dto.getRdsj() != null ) {
            pimPerson.setRdsj( dto.getRdsj() );
        }
        if ( dto.getLgkssj() != null ) {
            pimPerson.setLgkssj( dto.getLgkssj() );
        }
        if ( dto.getCym() != null ) {
            pimPerson.setCym( dto.getCym() );
        }
        if ( dto.getZt() != null ) {
            pimPerson.setZt( dto.getZt() );
        }
        if ( dto.getNl() != null ) {
            pimPerson.setNl( dto.getNl() );
        }
        if ( dto.getJlspzt() != null ) {
            pimPerson.setJlspzt( dto.getJlspzt() );
        }
        if ( dto.getRzqd() != null ) {
            pimPerson.setRzqd( dto.getRzqd() );
        }
        if ( dto.getSgjsrq() != null ) {
            pimPerson.setSgjsrq( dto.getSgjsrq() );
        }
        if ( dto.getZzmm() != null ) {
            pimPerson.setZzmm( dto.getZzmm() );
        }
        if ( dto.getJxdq() != null ) {
            pimPerson.setJxdq( dto.getJxdq() );
        }
        if ( dto.getKhcj() != null ) {
            pimPerson.setKhcj( dto.getKhcj() );
        }
        if ( dto.getXb() != null ) {
            pimPerson.setXb( dto.getXb() );
        }
        if ( dto.getSuperuser() != null ) {
            pimPerson.setSuperuser( dto.getSuperuser() );
        }
        if ( dto.getSgksrq() != null ) {
            pimPerson.setSgksrq( dto.getSgksrq() );
        }
        if ( dto.getNumcode() != null ) {
            pimPerson.setNumcode( dto.getNumcode() );
        }
        if ( dto.getCfyxjsrq() != null ) {
            pimPerson.setCfyxjsrq( dto.getCfyxjsrq() );
        }
        if ( dto.getCerttificate() != null ) {
            pimPerson.setCerttificate( dto.getCerttificate() );
        }
        if ( dto.getCsrq() != null ) {
            pimPerson.setCsrq( dto.getCsrq() );
        }
        if ( dto.getLeavedate() != null ) {
            pimPerson.setLeavedate( dto.getLeavedate() );
        }
        if ( dto.getFirsteducation() != null ) {
            pimPerson.setFirsteducation( dto.getFirsteducation() );
        }
        if ( dto.getGly() != null ) {
            pimPerson.setGly( dto.getGly() );
        }
        if ( dto.getJxsywds() != null ) {
            pimPerson.setJxsywds( dto.getJxsywds() );
        }
        if ( dto.getRznx() != null ) {
            pimPerson.setRznx( dto.getRznx() );
        }
        if ( dto.getHqxlbyyx() != null ) {
            pimPerson.setHqxlbyyx( dto.getHqxlbyyx() );
        }
        if ( dto.getYgzt() != null ) {
            pimPerson.setYgzt( dto.getYgzt() );
        }
        if ( dto.getCz() != null ) {
            pimPerson.setCz( dto.getCz() );
        }
        if ( dto.getDuration() != null ) {
            pimPerson.setDuration( dto.getDuration() );
        }
        if ( dto.getRcxllx() != null ) {
            pimPerson.setRcxllx( dto.getRcxllx() );
        }
        if ( dto.getHqxlsxzy() != null ) {
            pimPerson.setHqxlsxzy( dto.getHqxlsxzy() );
        }
        if ( dto.getGzbm() != null ) {
            pimPerson.setGzbm( dto.getGzbm() );
        }
        if ( dto.getZwrq() != null ) {
            pimPerson.setZwrq( dto.getZwrq() );
        }
        if ( dto.getLxdh() != null ) {
            pimPerson.setLxdh( dto.getLxdh() );
        }
        if ( dto.getDardsj() != null ) {
            pimPerson.setDardsj( dto.getDardsj() );
        }
        if ( dto.getDzyx() != null ) {
            pimPerson.setDzyx( dto.getDzyx() );
        }
        if ( dto.getHklx() != null ) {
            pimPerson.setHklx( dto.getHklx() );
        }
        if ( dto.getGly2() != null ) {
            pimPerson.setGly2( dto.getGly2() );
        }
        if ( dto.getRetiplace() != null ) {
            pimPerson.setRetiplace( dto.getRetiplace() );
        }
        if ( dto.getHigheducation() != null ) {
            pimPerson.setHigheducation( dto.getHigheducation() );
        }
        if ( dto.getJlczz() != null ) {
            pimPerson.setJlczz( dto.getJlczz() );
        }
        if ( dto.getZj() != null ) {
            pimPerson.setZj( dto.getZj() );
        }
        if ( dto.getHyzk() != null ) {
            pimPerson.setHyzk( dto.getHyzk() );
        }
        if ( dto.getDyxlsszy() != null ) {
            pimPerson.setDyxlsszy( dto.getDyxlsszy() );
        }
        if ( dto.getTxdq() != null ) {
            pimPerson.setTxdq( dto.getTxdq() );
        }
        if ( dto.getPortaluserid() != null ) {
            pimPerson.setPortaluserid( dto.getPortaluserid() );
        }
        if ( dto.getSftberp() != null ) {
            pimPerson.setSftberp( dto.getSftberp() );
        }
        if ( dto.getKhcjtx() != null ) {
            pimPerson.setKhcjtx( dto.getKhcjtx() );
        }
        if ( dto.getDacjgzsj() != null ) {
            pimPerson.setDacjgzsj( dto.getDacjgzsj() );
        }
        if ( dto.getJzrz() != null ) {
            pimPerson.setJzrz( dto.getJzrz() );
        }
        if ( dto.getSjtxrq() != null ) {
            pimPerson.setSjtxrq( dto.getSjtxrq() );
        }
        if ( dto.getXx() != null ) {
            pimPerson.setXx( dto.getXx() );
        }
        if ( dto.getJxssxds() != null ) {
            pimPerson.setJxssxds( dto.getJxssxds() );
        }
        if ( dto.getDyxlbyyx() != null ) {
            pimPerson.setDyxlbyyx( dto.getDyxlbyyx() );
        }
        if ( dto.getRzsj() != null ) {
            pimPerson.setRzsj( dto.getRzsj() );
        }
        if ( dto.getSfdszn() != null ) {
            pimPerson.setSfdszn( dto.getSfdszn() );
        }
        if ( dto.getXtbh() != null ) {
            pimPerson.setXtbh( dto.getXtbh() );
        }
        if ( dto.getPimpersonname() != null ) {
            pimPerson.setPimpersonname( dto.getPimpersonname() );
        }
        if ( dto.getWorkstate() != null ) {
            pimPerson.setWorkstate( dto.getWorkstate() );
        }
        if ( dto.getCjgzsj() != null ) {
            pimPerson.setCjgzsj( dto.getCjgzsj() );
        }
        if ( dto.getGwksrq() != null ) {
            pimPerson.setGwksrq( dto.getGwksrq() );
        }
        if ( dto.getTozjdate() != null ) {
            pimPerson.setTozjdate( dto.getTozjdate() );
        }
        if ( dto.getZjhm() != null ) {
            pimPerson.setZjhm( dto.getZjhm() );
        }
        if ( dto.getBlacklistreasons() != null ) {
            pimPerson.setBlacklistreasons( dto.getBlacklistreasons() );
        }
        if ( dto.getHjdz() != null ) {
            pimPerson.setHjdz( dto.getHjdz() );
        }
        if ( dto.getZwnx() != null ) {
            pimPerson.setZwnx( dto.getZwnx() );
        }
        if ( dto.getRtsj() != null ) {
            pimPerson.setRtsj( dto.getRtsj() );
        }
        if ( dto.getSgyy() != null ) {
            pimPerson.setSgyy( dto.getSgyy() );
        }
        if ( dto.getJlglbh() != null ) {
            pimPerson.setJlglbh( dto.getJlglbh() );
        }
        if ( dto.getLgnxColor() != null ) {
            pimPerson.setLgnxColor( dto.getLgnxColor() );
        }
        if ( dto.getYjsnf() != null ) {
            pimPerson.setYjsnf( dto.getYjsnf() );
        }
        if ( dto.getRankrq() != null ) {
            pimPerson.setRankrq( dto.getRankrq() );
        }
        if ( dto.getZp() != null ) {
            pimPerson.setZp( dto.getZp() );
        }
        if ( dto.getLgnx() != null ) {
            pimPerson.setLgnx( dto.getLgnx() );
        }
        if ( dto.getJtlxr() != null ) {
            pimPerson.setJtlxr( dto.getJtlxr() );
        }
        if ( dto.getSyqdqsj() != null ) {
            pimPerson.setSyqdqsj( dto.getSyqdqsj() );
        }
        if ( dto.getZw() != null ) {
            pimPerson.setZw( dto.getZw() );
        }
        if ( dto.getHtqdcs() != null ) {
            pimPerson.setHtqdcs( dto.getHtqdcs() );
        }
        if ( dto.getMz() != null ) {
            pimPerson.setMz( dto.getMz() );
        }
        if ( dto.getSfz() != null ) {
            pimPerson.setSfz( dto.getSfz() );
        }
        if ( dto.getRznldqColor() != null ) {
            pimPerson.setRznldqColor( dto.getRznldqColor() );
        }
        if ( dto.getYdzt() != null ) {
            pimPerson.setYdzt( dto.getYdzt() );
        }
        if ( dto.getYgbhqysj() != null ) {
            pimPerson.setYgbhqysj( dto.getYgbhqysj() );
        }
        if ( dto.getPimpersonname3() != null ) {
            pimPerson.setPimpersonname3( dto.getPimpersonname3() );
        }
        if ( dto.getPimpersonname2() != null ) {
            pimPerson.setPimpersonname2( dto.getPimpersonname2() );
        }
        if ( dto.getOrmorgname() != null ) {
            pimPerson.setOrmorgname( dto.getOrmorgname() );
        }
        if ( dto.getOrgtype() != null ) {
            pimPerson.setOrgtype( dto.getOrgtype() );
        }
        if ( dto.getOrmorgsectorid() != null ) {
            pimPerson.setOrmorgsectorid( dto.getOrmorgsectorid() );
        }
        if ( dto.getPcmrcxlid() != null ) {
            pimPerson.setPcmrcxlid( dto.getPcmrcxlid() );
        }
        if ( dto.getPimpersonid2() != null ) {
            pimPerson.setPimpersonid2( dto.getPimpersonid2() );
        }
        if ( dto.getPimcityid() != null ) {
            pimPerson.setPimcityid( dto.getPimcityid() );
        }
        if ( dto.getOrmorgid() != null ) {
            pimPerson.setOrmorgid( dto.getOrmorgid() );
        }
        if ( dto.getPcmjxsygzzjlmxid() != null ) {
            pimPerson.setPcmjxsygzzjlmxid( dto.getPcmjxsygzzjlmxid() );
        }
        if ( dto.getPimmajorsetypeid() != null ) {
            pimPerson.setPimmajorsetypeid( dto.getPimmajorsetypeid() );
        }
        if ( dto.getPimpersonid3() != null ) {
            pimPerson.setPimpersonid3( dto.getPimpersonid3() );
        }
        if ( dto.getTxnxColor() != null ) {
            pimPerson.setTxnxColor( dto.getTxnxColor() );
        }
        if ( dto.getZgcode() != null ) {
            pimPerson.setZgcode( dto.getZgcode() );
        }
        if ( dto.getCreateman() != null ) {
            pimPerson.setCreateman( dto.getCreateman() );
        }
        if ( dto.getEmployeeandno() != null ) {
            pimPerson.setEmployeeandno( dto.getEmployeeandno() );
        }
        if ( dto.getNj() != null ) {
            pimPerson.setNj( dto.getNj() );
        }
        if ( dto.getOrgid() != null ) {
            pimPerson.setOrgid( dto.getOrgid() );
        }
        if ( dto.getZyjszw() != null ) {
            pimPerson.setZyjszw( dto.getZyjszw() );
        }
        if ( dto.getEnable() != null ) {
            pimPerson.setEnable( dto.getEnable() );
        }
        if ( dto.getSfznl() != null ) {
            pimPerson.setSfznl( dto.getSfznl() );
        }
        if ( dto.getUpdateman() != null ) {
            pimPerson.setUpdateman( dto.getUpdateman() );
        }
        if ( dto.getUpdatedate() != null ) {
            pimPerson.setUpdatedate( dto.getUpdatedate() );
        }
        if ( dto.getTxnx() != null ) {
            pimPerson.setTxnx( dto.getTxnx() );
        }
        if ( dto.getOrgsectorid() != null ) {
            pimPerson.setOrgsectorid( dto.getOrgsectorid() );
        }
        if ( dto.getPimpersonid() != null ) {
            pimPerson.setPimpersonid( dto.getPimpersonid() );
        }
        if ( dto.getCreatedate() != null ) {
            pimPerson.setCreatedate( dto.getCreatedate() );
        }
        if ( dto.getZzdzs() != null ) {
            pimPerson.setZzdzs( dto.getZzdzs() );
        }
        if ( dto.getOrdervalue() != null ) {
            pimPerson.setOrdervalue( dto.getOrdervalue() );
        }
        if ( dto.getOrmorgsectorname() != null ) {
            pimPerson.setOrmorgsectorname( dto.getOrmorgsectorname() );
        }
        if ( dto.getPimmajorsetypename() != null ) {
            pimPerson.setPimmajorsetypename( dto.getPimmajorsetypename() );
        }
        if ( dto.getPcmrcxlname() != null ) {
            pimPerson.setPcmrcxlname( dto.getPcmrcxlname() );
        }
        if ( dto.getPimcityname() != null ) {
            pimPerson.setPimcityname( dto.getPimcityname() );
        }

        return pimPerson;
    }

    @Override
    public PimPersonDTO toDto(PimPerson entity) {
        if ( entity == null ) {
            return null;
        }

        PimPersonDTO pimPersonDTO = new PimPersonDTO();

        Map<String, Object> map = entity.getExtensionparams();
        if ( map != null ) {
            pimPersonDTO.setExtensionparams( new HashMap<String, Object>( map ) );
        }
        Set<String> set = entity.getFocusNull();
        if ( set != null ) {
            pimPersonDTO.setFocusNull( new HashSet<String>( set ) );
        }
        if ( entity.getGzzt() != null ) {
            pimPersonDTO.setGzzt( entity.getGzzt() );
        }
        if ( entity.getZjlx() != null ) {
            pimPersonDTO.setZjlx( entity.getZjlx() );
        }
        if ( entity.getZgzt() != null ) {
            pimPersonDTO.setZgzt( entity.getZgzt() );
        }
        if ( entity.getGw() != null ) {
            pimPersonDTO.setGw( entity.getGw() );
        }
        if ( entity.getYglx() != null ) {
            pimPersonDTO.setYglx( entity.getYglx() );
        }
        if ( entity.getDaxl() != null ) {
            pimPersonDTO.setDaxl( entity.getDaxl() );
        }
        if ( entity.getTransferdate() != null ) {
            pimPersonDTO.setTransferdate( entity.getTransferdate() );
        }
        if ( entity.getAhtc() != null ) {
            pimPersonDTO.setAhtc( entity.getAhtc() );
        }
        if ( entity.getRznldq() != null ) {
            pimPersonDTO.setRznldq( entity.getRznldq() );
        }
        if ( entity.getPostaladdress() != null ) {
            pimPersonDTO.setPostaladdress( entity.getPostaladdress() );
        }
        if ( entity.getSydq() != null ) {
            pimPersonDTO.setSydq( entity.getSydq() );
        }
        if ( entity.getDzjbjsj() != null ) {
            pimPersonDTO.setDzjbjsj( entity.getDzjbjsj() );
        }
        if ( entity.getJtlxrid() != null ) {
            pimPersonDTO.setJtlxrid( entity.getJtlxrid() );
        }
        if ( entity.getPostexpiration() != null ) {
            pimPersonDTO.setPostexpiration( entity.getPostexpiration() );
        }
        if ( entity.getJg() != null ) {
            pimPersonDTO.setJg( entity.getJg() );
        }
        if ( entity.getRank() != null ) {
            pimPersonDTO.setRank( entity.getRank() );
        }
        if ( entity.getGzzz() != null ) {
            pimPersonDTO.setGzzz( entity.getGzzz() );
        }
        if ( entity.getSyczjrq() != null ) {
            pimPersonDTO.setSyczjrq( entity.getSyczjrq() );
        }
        if ( entity.getHightitle() != null ) {
            pimPersonDTO.setHightitle( entity.getHightitle() );
        }
        if ( entity.getGzkssj() != null ) {
            pimPersonDTO.setGzkssj( entity.getGzkssj() );
        }
        if ( entity.getSpdylje() != null ) {
            pimPersonDTO.setSpdylje( entity.getSpdylje() );
        }
        if ( entity.getYygbh() != null ) {
            pimPersonDTO.setYygbh( entity.getYygbh() );
        }
        if ( entity.getJlss() != null ) {
            pimPersonDTO.setJlss( entity.getJlss() );
        }
        if ( entity.getIsleaderteam() != null ) {
            pimPersonDTO.setIsleaderteam( entity.getIsleaderteam() );
        }
        if ( entity.getHmd() != null ) {
            pimPersonDTO.setHmd( entity.getHmd() );
        }
        if ( entity.getDacsrq() != null ) {
            pimPersonDTO.setDacsrq( entity.getDacsrq() );
        }
        if ( entity.getJkzk() != null ) {
            pimPersonDTO.setJkzk( entity.getJkzk() );
        }
        if ( entity.getGwzt() != null ) {
            pimPersonDTO.setGwzt( entity.getGwzt() );
        }
        if ( entity.getDbdwsj() != null ) {
            pimPersonDTO.setDbdwsj( entity.getDbdwsj() );
        }
        if ( entity.getZyzg() != null ) {
            pimPersonDTO.setZyzg( entity.getZyzg() );
        }
        if ( entity.getCsd() != null ) {
            pimPersonDTO.setCsd( entity.getCsd() );
        }
        if ( entity.getJtlxrdh() != null ) {
            pimPersonDTO.setJtlxrdh( entity.getJtlxrdh() );
        }
        if ( entity.getDyxlbysj() != null ) {
            pimPersonDTO.setDyxlbysj( entity.getDyxlbysj() );
        }
        if ( entity.getYgbh() != null ) {
            pimPersonDTO.setYgbh( entity.getYgbh() );
        }
        if ( entity.getZjnx() != null ) {
            pimPersonDTO.setZjnx( entity.getZjnx() );
        }
        if ( entity.getRzdq() != null ) {
            pimPersonDTO.setRzdq( entity.getRzdq() );
        }
        if ( entity.getHjszd() != null ) {
            pimPersonDTO.setHjszd( entity.getHjszd() );
        }
        if ( entity.getGzjssj() != null ) {
            pimPersonDTO.setGzjssj( entity.getGzjssj() );
        }
        if ( entity.getSfnbfp() != null ) {
            pimPersonDTO.setSfnbfp( entity.getSfnbfp() );
        }
        if ( entity.getRdsj() != null ) {
            pimPersonDTO.setRdsj( entity.getRdsj() );
        }
        if ( entity.getLgkssj() != null ) {
            pimPersonDTO.setLgkssj( entity.getLgkssj() );
        }
        if ( entity.getCym() != null ) {
            pimPersonDTO.setCym( entity.getCym() );
        }
        if ( entity.getZt() != null ) {
            pimPersonDTO.setZt( entity.getZt() );
        }
        if ( entity.getNl() != null ) {
            pimPersonDTO.setNl( entity.getNl() );
        }
        if ( entity.getJlspzt() != null ) {
            pimPersonDTO.setJlspzt( entity.getJlspzt() );
        }
        if ( entity.getRzqd() != null ) {
            pimPersonDTO.setRzqd( entity.getRzqd() );
        }
        if ( entity.getSgjsrq() != null ) {
            pimPersonDTO.setSgjsrq( entity.getSgjsrq() );
        }
        if ( entity.getZzmm() != null ) {
            pimPersonDTO.setZzmm( entity.getZzmm() );
        }
        if ( entity.getJxdq() != null ) {
            pimPersonDTO.setJxdq( entity.getJxdq() );
        }
        if ( entity.getKhcj() != null ) {
            pimPersonDTO.setKhcj( entity.getKhcj() );
        }
        if ( entity.getXb() != null ) {
            pimPersonDTO.setXb( entity.getXb() );
        }
        if ( entity.getSuperuser() != null ) {
            pimPersonDTO.setSuperuser( entity.getSuperuser() );
        }
        if ( entity.getSgksrq() != null ) {
            pimPersonDTO.setSgksrq( entity.getSgksrq() );
        }
        if ( entity.getNumcode() != null ) {
            pimPersonDTO.setNumcode( entity.getNumcode() );
        }
        if ( entity.getCfyxjsrq() != null ) {
            pimPersonDTO.setCfyxjsrq( entity.getCfyxjsrq() );
        }
        if ( entity.getCerttificate() != null ) {
            pimPersonDTO.setCerttificate( entity.getCerttificate() );
        }
        if ( entity.getCsrq() != null ) {
            pimPersonDTO.setCsrq( entity.getCsrq() );
        }
        if ( entity.getLeavedate() != null ) {
            pimPersonDTO.setLeavedate( entity.getLeavedate() );
        }
        if ( entity.getFirsteducation() != null ) {
            pimPersonDTO.setFirsteducation( entity.getFirsteducation() );
        }
        if ( entity.getGly() != null ) {
            pimPersonDTO.setGly( entity.getGly() );
        }
        if ( entity.getJxsywds() != null ) {
            pimPersonDTO.setJxsywds( entity.getJxsywds() );
        }
        if ( entity.getRznx() != null ) {
            pimPersonDTO.setRznx( entity.getRznx() );
        }
        if ( entity.getHqxlbyyx() != null ) {
            pimPersonDTO.setHqxlbyyx( entity.getHqxlbyyx() );
        }
        if ( entity.getYgzt() != null ) {
            pimPersonDTO.setYgzt( entity.getYgzt() );
        }
        if ( entity.getCz() != null ) {
            pimPersonDTO.setCz( entity.getCz() );
        }
        if ( entity.getDuration() != null ) {
            pimPersonDTO.setDuration( entity.getDuration() );
        }
        if ( entity.getRcxllx() != null ) {
            pimPersonDTO.setRcxllx( entity.getRcxllx() );
        }
        if ( entity.getHqxlsxzy() != null ) {
            pimPersonDTO.setHqxlsxzy( entity.getHqxlsxzy() );
        }
        if ( entity.getGzbm() != null ) {
            pimPersonDTO.setGzbm( entity.getGzbm() );
        }
        if ( entity.getZwrq() != null ) {
            pimPersonDTO.setZwrq( entity.getZwrq() );
        }
        if ( entity.getLxdh() != null ) {
            pimPersonDTO.setLxdh( entity.getLxdh() );
        }
        if ( entity.getDardsj() != null ) {
            pimPersonDTO.setDardsj( entity.getDardsj() );
        }
        if ( entity.getDzyx() != null ) {
            pimPersonDTO.setDzyx( entity.getDzyx() );
        }
        if ( entity.getHklx() != null ) {
            pimPersonDTO.setHklx( entity.getHklx() );
        }
        if ( entity.getGly2() != null ) {
            pimPersonDTO.setGly2( entity.getGly2() );
        }
        if ( entity.getRetiplace() != null ) {
            pimPersonDTO.setRetiplace( entity.getRetiplace() );
        }
        if ( entity.getHigheducation() != null ) {
            pimPersonDTO.setHigheducation( entity.getHigheducation() );
        }
        if ( entity.getJlczz() != null ) {
            pimPersonDTO.setJlczz( entity.getJlczz() );
        }
        if ( entity.getZj() != null ) {
            pimPersonDTO.setZj( entity.getZj() );
        }
        if ( entity.getHyzk() != null ) {
            pimPersonDTO.setHyzk( entity.getHyzk() );
        }
        if ( entity.getDyxlsszy() != null ) {
            pimPersonDTO.setDyxlsszy( entity.getDyxlsszy() );
        }
        if ( entity.getTxdq() != null ) {
            pimPersonDTO.setTxdq( entity.getTxdq() );
        }
        if ( entity.getPortaluserid() != null ) {
            pimPersonDTO.setPortaluserid( entity.getPortaluserid() );
        }
        if ( entity.getSftberp() != null ) {
            pimPersonDTO.setSftberp( entity.getSftberp() );
        }
        if ( entity.getKhcjtx() != null ) {
            pimPersonDTO.setKhcjtx( entity.getKhcjtx() );
        }
        if ( entity.getDacjgzsj() != null ) {
            pimPersonDTO.setDacjgzsj( entity.getDacjgzsj() );
        }
        if ( entity.getJzrz() != null ) {
            pimPersonDTO.setJzrz( entity.getJzrz() );
        }
        if ( entity.getSjtxrq() != null ) {
            pimPersonDTO.setSjtxrq( entity.getSjtxrq() );
        }
        if ( entity.getXx() != null ) {
            pimPersonDTO.setXx( entity.getXx() );
        }
        if ( entity.getJxssxds() != null ) {
            pimPersonDTO.setJxssxds( entity.getJxssxds() );
        }
        if ( entity.getDyxlbyyx() != null ) {
            pimPersonDTO.setDyxlbyyx( entity.getDyxlbyyx() );
        }
        if ( entity.getRzsj() != null ) {
            pimPersonDTO.setRzsj( entity.getRzsj() );
        }
        if ( entity.getSfdszn() != null ) {
            pimPersonDTO.setSfdszn( entity.getSfdszn() );
        }
        if ( entity.getXtbh() != null ) {
            pimPersonDTO.setXtbh( entity.getXtbh() );
        }
        if ( entity.getPimpersonname() != null ) {
            pimPersonDTO.setPimpersonname( entity.getPimpersonname() );
        }
        if ( entity.getWorkstate() != null ) {
            pimPersonDTO.setWorkstate( entity.getWorkstate() );
        }
        if ( entity.getCjgzsj() != null ) {
            pimPersonDTO.setCjgzsj( entity.getCjgzsj() );
        }
        if ( entity.getGwksrq() != null ) {
            pimPersonDTO.setGwksrq( entity.getGwksrq() );
        }
        if ( entity.getTozjdate() != null ) {
            pimPersonDTO.setTozjdate( entity.getTozjdate() );
        }
        if ( entity.getZjhm() != null ) {
            pimPersonDTO.setZjhm( entity.getZjhm() );
        }
        if ( entity.getBlacklistreasons() != null ) {
            pimPersonDTO.setBlacklistreasons( entity.getBlacklistreasons() );
        }
        if ( entity.getHjdz() != null ) {
            pimPersonDTO.setHjdz( entity.getHjdz() );
        }
        if ( entity.getZwnx() != null ) {
            pimPersonDTO.setZwnx( entity.getZwnx() );
        }
        if ( entity.getRtsj() != null ) {
            pimPersonDTO.setRtsj( entity.getRtsj() );
        }
        if ( entity.getSgyy() != null ) {
            pimPersonDTO.setSgyy( entity.getSgyy() );
        }
        if ( entity.getJlglbh() != null ) {
            pimPersonDTO.setJlglbh( entity.getJlglbh() );
        }
        if ( entity.getLgnxColor() != null ) {
            pimPersonDTO.setLgnxColor( entity.getLgnxColor() );
        }
        if ( entity.getYjsnf() != null ) {
            pimPersonDTO.setYjsnf( entity.getYjsnf() );
        }
        if ( entity.getRankrq() != null ) {
            pimPersonDTO.setRankrq( entity.getRankrq() );
        }
        if ( entity.getZp() != null ) {
            pimPersonDTO.setZp( entity.getZp() );
        }
        if ( entity.getLgnx() != null ) {
            pimPersonDTO.setLgnx( entity.getLgnx() );
        }
        if ( entity.getJtlxr() != null ) {
            pimPersonDTO.setJtlxr( entity.getJtlxr() );
        }
        if ( entity.getSyqdqsj() != null ) {
            pimPersonDTO.setSyqdqsj( entity.getSyqdqsj() );
        }
        if ( entity.getZw() != null ) {
            pimPersonDTO.setZw( entity.getZw() );
        }
        if ( entity.getHtqdcs() != null ) {
            pimPersonDTO.setHtqdcs( entity.getHtqdcs() );
        }
        if ( entity.getMz() != null ) {
            pimPersonDTO.setMz( entity.getMz() );
        }
        if ( entity.getSfz() != null ) {
            pimPersonDTO.setSfz( entity.getSfz() );
        }
        if ( entity.getRznldqColor() != null ) {
            pimPersonDTO.setRznldqColor( entity.getRznldqColor() );
        }
        if ( entity.getYdzt() != null ) {
            pimPersonDTO.setYdzt( entity.getYdzt() );
        }
        if ( entity.getYgbhqysj() != null ) {
            pimPersonDTO.setYgbhqysj( entity.getYgbhqysj() );
        }
        if ( entity.getPimpersonname3() != null ) {
            pimPersonDTO.setPimpersonname3( entity.getPimpersonname3() );
        }
        if ( entity.getPimpersonname2() != null ) {
            pimPersonDTO.setPimpersonname2( entity.getPimpersonname2() );
        }
        if ( entity.getOrmorgname() != null ) {
            pimPersonDTO.setOrmorgname( entity.getOrmorgname() );
        }
        if ( entity.getOrgtype() != null ) {
            pimPersonDTO.setOrgtype( entity.getOrgtype() );
        }
        if ( entity.getOrmorgsectorid() != null ) {
            pimPersonDTO.setOrmorgsectorid( entity.getOrmorgsectorid() );
        }
        if ( entity.getPcmrcxlid() != null ) {
            pimPersonDTO.setPcmrcxlid( entity.getPcmrcxlid() );
        }
        if ( entity.getPimpersonid2() != null ) {
            pimPersonDTO.setPimpersonid2( entity.getPimpersonid2() );
        }
        if ( entity.getPimcityid() != null ) {
            pimPersonDTO.setPimcityid( entity.getPimcityid() );
        }
        if ( entity.getOrmorgid() != null ) {
            pimPersonDTO.setOrmorgid( entity.getOrmorgid() );
        }
        if ( entity.getPcmjxsygzzjlmxid() != null ) {
            pimPersonDTO.setPcmjxsygzzjlmxid( entity.getPcmjxsygzzjlmxid() );
        }
        if ( entity.getPimmajorsetypeid() != null ) {
            pimPersonDTO.setPimmajorsetypeid( entity.getPimmajorsetypeid() );
        }
        if ( entity.getPimpersonid3() != null ) {
            pimPersonDTO.setPimpersonid3( entity.getPimpersonid3() );
        }
        if ( entity.getTxnxColor() != null ) {
            pimPersonDTO.setTxnxColor( entity.getTxnxColor() );
        }
        if ( entity.getZgcode() != null ) {
            pimPersonDTO.setZgcode( entity.getZgcode() );
        }
        if ( entity.getCreateman() != null ) {
            pimPersonDTO.setCreateman( entity.getCreateman() );
        }
        if ( entity.getEmployeeandno() != null ) {
            pimPersonDTO.setEmployeeandno( entity.getEmployeeandno() );
        }
        if ( entity.getNj() != null ) {
            pimPersonDTO.setNj( entity.getNj() );
        }
        if ( entity.getOrgid() != null ) {
            pimPersonDTO.setOrgid( entity.getOrgid() );
        }
        if ( entity.getZyjszw() != null ) {
            pimPersonDTO.setZyjszw( entity.getZyjszw() );
        }
        if ( entity.getEnable() != null ) {
            pimPersonDTO.setEnable( entity.getEnable() );
        }
        if ( entity.getSfznl() != null ) {
            pimPersonDTO.setSfznl( entity.getSfznl() );
        }
        if ( entity.getUpdateman() != null ) {
            pimPersonDTO.setUpdateman( entity.getUpdateman() );
        }
        if ( entity.getUpdatedate() != null ) {
            pimPersonDTO.setUpdatedate( entity.getUpdatedate() );
        }
        if ( entity.getTxnx() != null ) {
            pimPersonDTO.setTxnx( entity.getTxnx() );
        }
        if ( entity.getOrgsectorid() != null ) {
            pimPersonDTO.setOrgsectorid( entity.getOrgsectorid() );
        }
        if ( entity.getPimpersonid() != null ) {
            pimPersonDTO.setPimpersonid( entity.getPimpersonid() );
        }
        if ( entity.getCreatedate() != null ) {
            pimPersonDTO.setCreatedate( entity.getCreatedate() );
        }
        if ( entity.getZzdzs() != null ) {
            pimPersonDTO.setZzdzs( entity.getZzdzs() );
        }
        if ( entity.getOrdervalue() != null ) {
            pimPersonDTO.setOrdervalue( entity.getOrdervalue() );
        }
        if ( entity.getOrmorgsectorname() != null ) {
            pimPersonDTO.setOrmorgsectorname( entity.getOrmorgsectorname() );
        }
        if ( entity.getPimmajorsetypename() != null ) {
            pimPersonDTO.setPimmajorsetypename( entity.getPimmajorsetypename() );
        }
        if ( entity.getPcmrcxlname() != null ) {
            pimPersonDTO.setPcmrcxlname( entity.getPcmrcxlname() );
        }
        if ( entity.getPimcityname() != null ) {
            pimPersonDTO.setPimcityname( entity.getPimcityname() );
        }

        return pimPersonDTO;
    }

    @Override
    public List<PimPerson> toDomain(List<PimPersonDTO> dtoList) {
        if ( dtoList == null ) {
            return null;
        }

        List<PimPerson> list = new ArrayList<PimPerson>( dtoList.size() );
        for ( PimPersonDTO pimPersonDTO : dtoList ) {
            list.add( toDomain( pimPersonDTO ) );
        }

        return list;
    }

    @Override
    public List<PimPersonDTO> toDto(List<PimPerson> entityList) {
        if ( entityList == null ) {
            return null;
        }

        List<PimPersonDTO> list = new ArrayList<PimPersonDTO>( entityList.size() );
        for ( PimPerson pimPerson : entityList ) {
            list.add( toDto( pimPerson ) );
        }

        return list;
    }
}
