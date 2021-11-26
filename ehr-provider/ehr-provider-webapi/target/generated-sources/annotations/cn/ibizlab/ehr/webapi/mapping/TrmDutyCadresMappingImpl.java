package cn.ibizlab.ehr.webapi.mapping;

import cn.ibizlab.ehr.core.trm.domain.TrmDutyCadres;
import cn.ibizlab.ehr.webapi.dto.TrmDutyCadresDTO;
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
    date = "2021-09-04T00:31:55+0800",
    comments = "version: 1.3.0.Final, compiler: javac, environment: Java 1.8.0_92 (Oracle Corporation)"
)
@Component
public class TrmDutyCadresMappingImpl implements TrmDutyCadresMapping {

    @Override
    public TrmDutyCadres toDomain(TrmDutyCadresDTO dto) {
        if ( dto == null ) {
            return null;
        }

        TrmDutyCadres trmDutyCadres = new TrmDutyCadres();

        Set<String> set = dto.getFocusNull();
        if ( set != null ) {
            trmDutyCadres.setFocusNull( new HashSet<String>( set ) );
        }
        Map<String, Object> map = dto.getExtensionparams();
        if ( map != null ) {
            trmDutyCadres.setExtensionparams( new HashMap<String, Object>( map ) );
        }
        if ( dto.getKhcj() != null ) {
            trmDutyCadres.setKhcj( dto.getKhcj() );
        }
        if ( dto.getCstype() != null ) {
            trmDutyCadres.setCstype( dto.getCstype() );
        }
        if ( dto.getJtyy() != null ) {
            trmDutyCadres.setJtyy( dto.getJtyy() );
        }
        if ( dto.getJsrq() != null ) {
            trmDutyCadres.setJsrq( dto.getJsrq() );
        }
        if ( dto.getSjtpnum() != null ) {
            trmDutyCadres.setSjtpnum( dto.getSjtpnum() );
        }
        if ( dto.getRs() != null ) {
            trmDutyCadres.setRs( dto.getRs() );
        }
        if ( dto.getXh() != null ) {
            trmDutyCadres.setXh( dto.getXh() );
        }
        if ( dto.getTrmdutycadresname() != null ) {
            trmDutyCadres.setTrmdutycadresname( dto.getTrmdutycadresname() );
        }
        if ( dto.getTcyy() != null ) {
            trmDutyCadres.setTcyy( dto.getTcyy() );
        }
        if ( dto.getRylb() != null ) {
            trmDutyCadres.setRylb( dto.getRylb() );
        }
        if ( dto.getXgw() != null ) {
            trmDutyCadres.setXgw( dto.getXgw() );
        }
        if ( dto.getYear() != null ) {
            trmDutyCadres.setYear( dto.getYear() );
        }
        if ( dto.getQsrq() != null ) {
            trmDutyCadres.setQsrq( dto.getQsrq() );
        }
        if ( dto.getStatus() != null ) {
            trmDutyCadres.setStatus( dto.getStatus() );
        }
        if ( dto.getZjycjxkhcj() != null ) {
            trmDutyCadres.setZjycjxkhcj( dto.getZjycjxkhcj() );
        }
        if ( dto.getTpnum() != null ) {
            trmDutyCadres.setTpnum( dto.getTpnum() );
        }
        if ( dto.getBz() != null ) {
            trmDutyCadres.setBz( dto.getBz() );
        }
        if ( dto.getPimpersonname2() != null ) {
            trmDutyCadres.setPimpersonname2( dto.getPimpersonname2() );
        }
        if ( dto.getOrmpostid() != null ) {
            trmDutyCadres.setOrmpostid( dto.getOrmpostid() );
        }
        if ( dto.getPimpersonid2() != null ) {
            trmDutyCadres.setPimpersonid2( dto.getPimpersonid2() );
        }
        if ( dto.getOrmrankid() != null ) {
            trmDutyCadres.setOrmrankid( dto.getOrmrankid() );
        }
        if ( dto.getOrmdutyid() != null ) {
            trmDutyCadres.setOrmdutyid( dto.getOrmdutyid() );
        }
        if ( dto.getPimpersonid() != null ) {
            trmDutyCadres.setPimpersonid( dto.getPimpersonid() );
        }
        if ( dto.getOrmorgsectorid() != null ) {
            trmDutyCadres.setOrmorgsectorid( dto.getOrmorgsectorid() );
        }
        if ( dto.getOrmorgid() != null ) {
            trmDutyCadres.setOrmorgid( dto.getOrmorgid() );
        }
        if ( dto.getEnable() != null ) {
            trmDutyCadres.setEnable( dto.getEnable() );
        }
        if ( dto.getUpdatedate() != null ) {
            trmDutyCadres.setUpdatedate( dto.getUpdatedate() );
        }
        if ( dto.getCreateman() != null ) {
            trmDutyCadres.setCreateman( dto.getCreateman() );
        }
        if ( dto.getCreatedate() != null ) {
            trmDutyCadres.setCreatedate( dto.getCreatedate() );
        }
        if ( dto.getUpdateman() != null ) {
            trmDutyCadres.setUpdateman( dto.getUpdateman() );
        }
        if ( dto.getSyts() != null ) {
            trmDutyCadres.setSyts( dto.getSyts() );
        }
        if ( dto.getTrmdutycadresid() != null ) {
            trmDutyCadres.setTrmdutycadresid( dto.getTrmdutycadresid() );
        }
        if ( dto.getZwnx() != null ) {
            trmDutyCadres.setZwnx( dto.getZwnx() );
        }
        if ( dto.getOrgid() != null ) {
            trmDutyCadres.setOrgid( dto.getOrgid() );
        }
        if ( dto.getOrmorgname() != null ) {
            trmDutyCadres.setOrmorgname( dto.getOrmorgname() );
        }
        if ( dto.getPimpersonname() != null ) {
            trmDutyCadres.setPimpersonname( dto.getPimpersonname() );
        }
        if ( dto.getOrmorgsectorname2() != null ) {
            trmDutyCadres.setOrmorgsectorname2( dto.getOrmorgsectorname2() );
        }
        if ( dto.getRank() != null ) {
            trmDutyCadres.setRank( dto.getRank() );
        }
        if ( dto.getZwrq() != null ) {
            trmDutyCadres.setZwrq( dto.getZwrq() );
        }
        if ( dto.getOrmrankname() != null ) {
            trmDutyCadres.setOrmrankname( dto.getOrmrankname() );
        }
        if ( dto.getOrmorgname2() != null ) {
            trmDutyCadres.setOrmorgname2( dto.getOrmorgname2() );
        }
        if ( dto.getOrmpostname() != null ) {
            trmDutyCadres.setOrmpostname( dto.getOrmpostname() );
        }
        if ( dto.getZzdzs() != null ) {
            trmDutyCadres.setZzdzs( dto.getZzdzs() );
        }
        if ( dto.getGw() != null ) {
            trmDutyCadres.setGw( dto.getGw() );
        }
        if ( dto.getZw() != null ) {
            trmDutyCadres.setZw( dto.getZw() );
        }
        if ( dto.getOrmorgsectorname() != null ) {
            trmDutyCadres.setOrmorgsectorname( dto.getOrmorgsectorname() );
        }
        if ( dto.getYgbh() != null ) {
            trmDutyCadres.setYgbh( dto.getYgbh() );
        }
        if ( dto.getOrmdutyname() != null ) {
            trmDutyCadres.setOrmdutyname( dto.getOrmdutyname() );
        }

        return trmDutyCadres;
    }

    @Override
    public TrmDutyCadresDTO toDto(TrmDutyCadres entity) {
        if ( entity == null ) {
            return null;
        }

        TrmDutyCadresDTO trmDutyCadresDTO = new TrmDutyCadresDTO();

        Map<String, Object> map = entity.getExtensionparams();
        if ( map != null ) {
            trmDutyCadresDTO.setExtensionparams( new HashMap<String, Object>( map ) );
        }
        Set<String> set = entity.getFocusNull();
        if ( set != null ) {
            trmDutyCadresDTO.setFocusNull( new HashSet<String>( set ) );
        }
        if ( entity.getKhcj() != null ) {
            trmDutyCadresDTO.setKhcj( entity.getKhcj() );
        }
        if ( entity.getCstype() != null ) {
            trmDutyCadresDTO.setCstype( entity.getCstype() );
        }
        if ( entity.getJtyy() != null ) {
            trmDutyCadresDTO.setJtyy( entity.getJtyy() );
        }
        if ( entity.getJsrq() != null ) {
            trmDutyCadresDTO.setJsrq( entity.getJsrq() );
        }
        if ( entity.getSjtpnum() != null ) {
            trmDutyCadresDTO.setSjtpnum( entity.getSjtpnum() );
        }
        if ( entity.getRs() != null ) {
            trmDutyCadresDTO.setRs( entity.getRs() );
        }
        if ( entity.getXh() != null ) {
            trmDutyCadresDTO.setXh( entity.getXh() );
        }
        if ( entity.getTrmdutycadresname() != null ) {
            trmDutyCadresDTO.setTrmdutycadresname( entity.getTrmdutycadresname() );
        }
        if ( entity.getTcyy() != null ) {
            trmDutyCadresDTO.setTcyy( entity.getTcyy() );
        }
        if ( entity.getRylb() != null ) {
            trmDutyCadresDTO.setRylb( entity.getRylb() );
        }
        if ( entity.getXgw() != null ) {
            trmDutyCadresDTO.setXgw( entity.getXgw() );
        }
        if ( entity.getYear() != null ) {
            trmDutyCadresDTO.setYear( entity.getYear() );
        }
        if ( entity.getQsrq() != null ) {
            trmDutyCadresDTO.setQsrq( entity.getQsrq() );
        }
        if ( entity.getStatus() != null ) {
            trmDutyCadresDTO.setStatus( entity.getStatus() );
        }
        if ( entity.getZjycjxkhcj() != null ) {
            trmDutyCadresDTO.setZjycjxkhcj( entity.getZjycjxkhcj() );
        }
        if ( entity.getTpnum() != null ) {
            trmDutyCadresDTO.setTpnum( entity.getTpnum() );
        }
        if ( entity.getBz() != null ) {
            trmDutyCadresDTO.setBz( entity.getBz() );
        }
        if ( entity.getPimpersonname2() != null ) {
            trmDutyCadresDTO.setPimpersonname2( entity.getPimpersonname2() );
        }
        if ( entity.getOrmpostid() != null ) {
            trmDutyCadresDTO.setOrmpostid( entity.getOrmpostid() );
        }
        if ( entity.getPimpersonid2() != null ) {
            trmDutyCadresDTO.setPimpersonid2( entity.getPimpersonid2() );
        }
        if ( entity.getOrmrankid() != null ) {
            trmDutyCadresDTO.setOrmrankid( entity.getOrmrankid() );
        }
        if ( entity.getOrmdutyid() != null ) {
            trmDutyCadresDTO.setOrmdutyid( entity.getOrmdutyid() );
        }
        if ( entity.getPimpersonid() != null ) {
            trmDutyCadresDTO.setPimpersonid( entity.getPimpersonid() );
        }
        if ( entity.getOrmorgsectorid() != null ) {
            trmDutyCadresDTO.setOrmorgsectorid( entity.getOrmorgsectorid() );
        }
        if ( entity.getOrmorgid() != null ) {
            trmDutyCadresDTO.setOrmorgid( entity.getOrmorgid() );
        }
        if ( entity.getEnable() != null ) {
            trmDutyCadresDTO.setEnable( entity.getEnable() );
        }
        if ( entity.getUpdatedate() != null ) {
            trmDutyCadresDTO.setUpdatedate( entity.getUpdatedate() );
        }
        if ( entity.getCreateman() != null ) {
            trmDutyCadresDTO.setCreateman( entity.getCreateman() );
        }
        if ( entity.getCreatedate() != null ) {
            trmDutyCadresDTO.setCreatedate( entity.getCreatedate() );
        }
        if ( entity.getUpdateman() != null ) {
            trmDutyCadresDTO.setUpdateman( entity.getUpdateman() );
        }
        if ( entity.getSyts() != null ) {
            trmDutyCadresDTO.setSyts( entity.getSyts() );
        }
        if ( entity.getTrmdutycadresid() != null ) {
            trmDutyCadresDTO.setTrmdutycadresid( entity.getTrmdutycadresid() );
        }
        if ( entity.getZwnx() != null ) {
            trmDutyCadresDTO.setZwnx( entity.getZwnx() );
        }
        if ( entity.getOrgid() != null ) {
            trmDutyCadresDTO.setOrgid( entity.getOrgid() );
        }
        if ( entity.getOrmorgname() != null ) {
            trmDutyCadresDTO.setOrmorgname( entity.getOrmorgname() );
        }
        if ( entity.getPimpersonname() != null ) {
            trmDutyCadresDTO.setPimpersonname( entity.getPimpersonname() );
        }
        if ( entity.getOrmorgsectorname2() != null ) {
            trmDutyCadresDTO.setOrmorgsectorname2( entity.getOrmorgsectorname2() );
        }
        if ( entity.getRank() != null ) {
            trmDutyCadresDTO.setRank( entity.getRank() );
        }
        if ( entity.getZwrq() != null ) {
            trmDutyCadresDTO.setZwrq( entity.getZwrq() );
        }
        if ( entity.getOrmrankname() != null ) {
            trmDutyCadresDTO.setOrmrankname( entity.getOrmrankname() );
        }
        if ( entity.getOrmorgname2() != null ) {
            trmDutyCadresDTO.setOrmorgname2( entity.getOrmorgname2() );
        }
        if ( entity.getOrmpostname() != null ) {
            trmDutyCadresDTO.setOrmpostname( entity.getOrmpostname() );
        }
        if ( entity.getZzdzs() != null ) {
            trmDutyCadresDTO.setZzdzs( entity.getZzdzs() );
        }
        if ( entity.getGw() != null ) {
            trmDutyCadresDTO.setGw( entity.getGw() );
        }
        if ( entity.getZw() != null ) {
            trmDutyCadresDTO.setZw( entity.getZw() );
        }
        if ( entity.getOrmorgsectorname() != null ) {
            trmDutyCadresDTO.setOrmorgsectorname( entity.getOrmorgsectorname() );
        }
        if ( entity.getYgbh() != null ) {
            trmDutyCadresDTO.setYgbh( entity.getYgbh() );
        }
        if ( entity.getOrmdutyname() != null ) {
            trmDutyCadresDTO.setOrmdutyname( entity.getOrmdutyname() );
        }

        return trmDutyCadresDTO;
    }

    @Override
    public List<TrmDutyCadres> toDomain(List<TrmDutyCadresDTO> dtoList) {
        if ( dtoList == null ) {
            return null;
        }

        List<TrmDutyCadres> list = new ArrayList<TrmDutyCadres>( dtoList.size() );
        for ( TrmDutyCadresDTO trmDutyCadresDTO : dtoList ) {
            list.add( toDomain( trmDutyCadresDTO ) );
        }

        return list;
    }

    @Override
    public List<TrmDutyCadresDTO> toDto(List<TrmDutyCadres> entityList) {
        if ( entityList == null ) {
            return null;
        }

        List<TrmDutyCadresDTO> list = new ArrayList<TrmDutyCadresDTO>( entityList.size() );
        for ( TrmDutyCadres trmDutyCadres : entityList ) {
            list.add( toDto( trmDutyCadres ) );
        }

        return list;
    }
}
