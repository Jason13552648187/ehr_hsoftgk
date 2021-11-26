package cn.ibizlab.ehr.webapi.mapping;

import cn.ibizlab.ehr.core.trm.domain.TrmGradecadres;
import cn.ibizlab.ehr.webapi.dto.TrmGradecadresDTO;
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
    date = "2021-09-04T00:31:56+0800",
    comments = "version: 1.3.0.Final, compiler: javac, environment: Java 1.8.0_92 (Oracle Corporation)"
)
@Component
public class TrmGradecadresMappingImpl implements TrmGradecadresMapping {

    @Override
    public TrmGradecadres toDomain(TrmGradecadresDTO dto) {
        if ( dto == null ) {
            return null;
        }

        TrmGradecadres trmGradecadres = new TrmGradecadres();

        Set<String> set = dto.getFocusNull();
        if ( set != null ) {
            trmGradecadres.setFocusNull( new HashSet<String>( set ) );
        }
        Map<String, Object> map = dto.getExtensionparams();
        if ( map != null ) {
            trmGradecadres.setExtensionparams( new HashMap<String, Object>( map ) );
        }
        if ( dto.getTrmgradecadresname() != null ) {
            trmGradecadres.setTrmgradecadresname( dto.getTrmgradecadresname() );
        }
        if ( dto.getXh() != null ) {
            trmGradecadres.setXh( dto.getXh() );
        }
        if ( dto.getOrmrankid() != null ) {
            trmGradecadres.setOrmrankid( dto.getOrmrankid() );
        }
        if ( dto.getOrmorgsectorid() != null ) {
            trmGradecadres.setOrmorgsectorid( dto.getOrmorgsectorid() );
        }
        if ( dto.getPimpersonid() != null ) {
            trmGradecadres.setPimpersonid( dto.getPimpersonid() );
        }
        if ( dto.getOrmdutyid() != null ) {
            trmGradecadres.setOrmdutyid( dto.getOrmdutyid() );
        }
        if ( dto.getOrmorgsectorid2() != null ) {
            trmGradecadres.setOrmorgsectorid2( dto.getOrmorgsectorid2() );
        }
        if ( dto.getOrmorgid() != null ) {
            trmGradecadres.setOrmorgid( dto.getOrmorgid() );
        }
        if ( dto.getOrmorgid2() != null ) {
            trmGradecadres.setOrmorgid2( dto.getOrmorgid2() );
        }
        if ( dto.getPimpersonid2() != null ) {
            trmGradecadres.setPimpersonid2( dto.getPimpersonid2() );
        }
        if ( dto.getCreateman() != null ) {
            trmGradecadres.setCreateman( dto.getCreateman() );
        }
        if ( dto.getEnable() != null ) {
            trmGradecadres.setEnable( dto.getEnable() );
        }
        if ( dto.getTrmgradecadresid() != null ) {
            trmGradecadres.setTrmgradecadresid( dto.getTrmgradecadresid() );
        }
        if ( dto.getUpdateman() != null ) {
            trmGradecadres.setUpdateman( dto.getUpdateman() );
        }
        if ( dto.getUpdatedate() != null ) {
            trmGradecadres.setUpdatedate( dto.getUpdatedate() );
        }
        if ( dto.getCreatedate() != null ) {
            trmGradecadres.setCreatedate( dto.getCreatedate() );
        }
        if ( dto.getOrmdutyname() != null ) {
            trmGradecadres.setOrmdutyname( dto.getOrmdutyname() );
        }
        if ( dto.getPimpersonname() != null ) {
            trmGradecadres.setPimpersonname( dto.getPimpersonname() );
        }
        if ( dto.getPimpersonname2() != null ) {
            trmGradecadres.setPimpersonname2( dto.getPimpersonname2() );
        }
        if ( dto.getOrmorgsectorname2() != null ) {
            trmGradecadres.setOrmorgsectorname2( dto.getOrmorgsectorname2() );
        }
        if ( dto.getOrmorgsectorname() != null ) {
            trmGradecadres.setOrmorgsectorname( dto.getOrmorgsectorname() );
        }
        if ( dto.getOrmrankname() != null ) {
            trmGradecadres.setOrmrankname( dto.getOrmrankname() );
        }
        if ( dto.getOrmorgname() != null ) {
            trmGradecadres.setOrmorgname( dto.getOrmorgname() );
        }
        if ( dto.getOrmorgname2() != null ) {
            trmGradecadres.setOrmorgname2( dto.getOrmorgname2() );
        }

        return trmGradecadres;
    }

    @Override
    public TrmGradecadresDTO toDto(TrmGradecadres entity) {
        if ( entity == null ) {
            return null;
        }

        TrmGradecadresDTO trmGradecadresDTO = new TrmGradecadresDTO();

        Map<String, Object> map = entity.getExtensionparams();
        if ( map != null ) {
            trmGradecadresDTO.setExtensionparams( new HashMap<String, Object>( map ) );
        }
        Set<String> set = entity.getFocusNull();
        if ( set != null ) {
            trmGradecadresDTO.setFocusNull( new HashSet<String>( set ) );
        }
        if ( entity.getTrmgradecadresname() != null ) {
            trmGradecadresDTO.setTrmgradecadresname( entity.getTrmgradecadresname() );
        }
        if ( entity.getXh() != null ) {
            trmGradecadresDTO.setXh( entity.getXh() );
        }
        if ( entity.getOrmrankid() != null ) {
            trmGradecadresDTO.setOrmrankid( entity.getOrmrankid() );
        }
        if ( entity.getOrmorgsectorid() != null ) {
            trmGradecadresDTO.setOrmorgsectorid( entity.getOrmorgsectorid() );
        }
        if ( entity.getPimpersonid() != null ) {
            trmGradecadresDTO.setPimpersonid( entity.getPimpersonid() );
        }
        if ( entity.getOrmdutyid() != null ) {
            trmGradecadresDTO.setOrmdutyid( entity.getOrmdutyid() );
        }
        if ( entity.getOrmorgsectorid2() != null ) {
            trmGradecadresDTO.setOrmorgsectorid2( entity.getOrmorgsectorid2() );
        }
        if ( entity.getOrmorgid() != null ) {
            trmGradecadresDTO.setOrmorgid( entity.getOrmorgid() );
        }
        if ( entity.getOrmorgid2() != null ) {
            trmGradecadresDTO.setOrmorgid2( entity.getOrmorgid2() );
        }
        if ( entity.getPimpersonid2() != null ) {
            trmGradecadresDTO.setPimpersonid2( entity.getPimpersonid2() );
        }
        if ( entity.getCreateman() != null ) {
            trmGradecadresDTO.setCreateman( entity.getCreateman() );
        }
        if ( entity.getEnable() != null ) {
            trmGradecadresDTO.setEnable( entity.getEnable() );
        }
        if ( entity.getTrmgradecadresid() != null ) {
            trmGradecadresDTO.setTrmgradecadresid( entity.getTrmgradecadresid() );
        }
        if ( entity.getUpdateman() != null ) {
            trmGradecadresDTO.setUpdateman( entity.getUpdateman() );
        }
        if ( entity.getUpdatedate() != null ) {
            trmGradecadresDTO.setUpdatedate( entity.getUpdatedate() );
        }
        if ( entity.getCreatedate() != null ) {
            trmGradecadresDTO.setCreatedate( entity.getCreatedate() );
        }
        if ( entity.getOrmdutyname() != null ) {
            trmGradecadresDTO.setOrmdutyname( entity.getOrmdutyname() );
        }
        if ( entity.getPimpersonname() != null ) {
            trmGradecadresDTO.setPimpersonname( entity.getPimpersonname() );
        }
        if ( entity.getPimpersonname2() != null ) {
            trmGradecadresDTO.setPimpersonname2( entity.getPimpersonname2() );
        }
        if ( entity.getOrmorgsectorname2() != null ) {
            trmGradecadresDTO.setOrmorgsectorname2( entity.getOrmorgsectorname2() );
        }
        if ( entity.getOrmorgsectorname() != null ) {
            trmGradecadresDTO.setOrmorgsectorname( entity.getOrmorgsectorname() );
        }
        if ( entity.getOrmrankname() != null ) {
            trmGradecadresDTO.setOrmrankname( entity.getOrmrankname() );
        }
        if ( entity.getOrmorgname() != null ) {
            trmGradecadresDTO.setOrmorgname( entity.getOrmorgname() );
        }
        if ( entity.getOrmorgname2() != null ) {
            trmGradecadresDTO.setOrmorgname2( entity.getOrmorgname2() );
        }

        return trmGradecadresDTO;
    }

    @Override
    public List<TrmGradecadres> toDomain(List<TrmGradecadresDTO> dtoList) {
        if ( dtoList == null ) {
            return null;
        }

        List<TrmGradecadres> list = new ArrayList<TrmGradecadres>( dtoList.size() );
        for ( TrmGradecadresDTO trmGradecadresDTO : dtoList ) {
            list.add( toDomain( trmGradecadresDTO ) );
        }

        return list;
    }

    @Override
    public List<TrmGradecadresDTO> toDto(List<TrmGradecadres> entityList) {
        if ( entityList == null ) {
            return null;
        }

        List<TrmGradecadresDTO> list = new ArrayList<TrmGradecadresDTO>( entityList.size() );
        for ( TrmGradecadres trmGradecadres : entityList ) {
            list.add( toDto( trmGradecadres ) );
        }

        return list;
    }
}
