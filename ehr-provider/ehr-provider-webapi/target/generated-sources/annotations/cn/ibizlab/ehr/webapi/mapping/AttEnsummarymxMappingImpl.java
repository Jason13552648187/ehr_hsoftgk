package cn.ibizlab.ehr.webapi.mapping;

import cn.ibizlab.ehr.core.att.domain.AttEnsummarymx;
import cn.ibizlab.ehr.webapi.dto.AttEnsummarymxDTO;
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
    date = "2021-09-04T00:31:52+0800",
    comments = "version: 1.3.0.Final, compiler: javac, environment: Java 1.8.0_92 (Oracle Corporation)"
)
@Component
public class AttEnsummarymxMappingImpl implements AttEnsummarymxMapping {

    @Override
    public AttEnsummarymx toDomain(AttEnsummarymxDTO dto) {
        if ( dto == null ) {
            return null;
        }

        AttEnsummarymx attEnsummarymx = new AttEnsummarymx();

        Set<String> set = dto.getFocusNull();
        if ( set != null ) {
            attEnsummarymx.setFocusNull( new HashSet<String>( set ) );
        }
        Map<String, Object> map = dto.getExtensionparams();
        if ( map != null ) {
            attEnsummarymx.setExtensionparams( new HashMap<String, Object>( map ) );
        }
        if ( dto.getTs() != null ) {
            attEnsummarymx.setTs( dto.getTs() );
        }
        if ( dto.getSjts() != null ) {
            attEnsummarymx.setSjts( dto.getSjts() );
        }
        if ( dto.getAttendancesummarymxname() != null ) {
            attEnsummarymx.setAttendancesummarymxname( dto.getAttendancesummarymxname() );
        }
        if ( dto.getKqlx() != null ) {
            attEnsummarymx.setKqlx( dto.getKqlx() );
        }
        if ( dto.getCreatedate() != null ) {
            attEnsummarymx.setCreatedate( dto.getCreatedate() );
        }
        if ( dto.getAttendancesummarymxid() != null ) {
            attEnsummarymx.setAttendancesummarymxid( dto.getAttendancesummarymxid() );
        }
        if ( dto.getUpdatedate() != null ) {
            attEnsummarymx.setUpdatedate( dto.getUpdatedate() );
        }
        if ( dto.getCreateman() != null ) {
            attEnsummarymx.setCreateman( dto.getCreateman() );
        }
        if ( dto.getEnable() != null ) {
            attEnsummarymx.setEnable( dto.getEnable() );
        }
        if ( dto.getUpdateman() != null ) {
            attEnsummarymx.setUpdateman( dto.getUpdateman() );
        }

        return attEnsummarymx;
    }

    @Override
    public AttEnsummarymxDTO toDto(AttEnsummarymx entity) {
        if ( entity == null ) {
            return null;
        }

        AttEnsummarymxDTO attEnsummarymxDTO = new AttEnsummarymxDTO();

        Map<String, Object> map = entity.getExtensionparams();
        if ( map != null ) {
            attEnsummarymxDTO.setExtensionparams( new HashMap<String, Object>( map ) );
        }
        Set<String> set = entity.getFocusNull();
        if ( set != null ) {
            attEnsummarymxDTO.setFocusNull( new HashSet<String>( set ) );
        }
        if ( entity.getTs() != null ) {
            attEnsummarymxDTO.setTs( entity.getTs() );
        }
        if ( entity.getSjts() != null ) {
            attEnsummarymxDTO.setSjts( entity.getSjts() );
        }
        if ( entity.getAttendancesummarymxname() != null ) {
            attEnsummarymxDTO.setAttendancesummarymxname( entity.getAttendancesummarymxname() );
        }
        if ( entity.getKqlx() != null ) {
            attEnsummarymxDTO.setKqlx( entity.getKqlx() );
        }
        if ( entity.getCreatedate() != null ) {
            attEnsummarymxDTO.setCreatedate( entity.getCreatedate() );
        }
        if ( entity.getAttendancesummarymxid() != null ) {
            attEnsummarymxDTO.setAttendancesummarymxid( entity.getAttendancesummarymxid() );
        }
        if ( entity.getUpdatedate() != null ) {
            attEnsummarymxDTO.setUpdatedate( entity.getUpdatedate() );
        }
        if ( entity.getCreateman() != null ) {
            attEnsummarymxDTO.setCreateman( entity.getCreateman() );
        }
        if ( entity.getEnable() != null ) {
            attEnsummarymxDTO.setEnable( entity.getEnable() );
        }
        if ( entity.getUpdateman() != null ) {
            attEnsummarymxDTO.setUpdateman( entity.getUpdateman() );
        }

        return attEnsummarymxDTO;
    }

    @Override
    public List<AttEnsummarymx> toDomain(List<AttEnsummarymxDTO> dtoList) {
        if ( dtoList == null ) {
            return null;
        }

        List<AttEnsummarymx> list = new ArrayList<AttEnsummarymx>( dtoList.size() );
        for ( AttEnsummarymxDTO attEnsummarymxDTO : dtoList ) {
            list.add( toDomain( attEnsummarymxDTO ) );
        }

        return list;
    }

    @Override
    public List<AttEnsummarymxDTO> toDto(List<AttEnsummarymx> entityList) {
        if ( entityList == null ) {
            return null;
        }

        List<AttEnsummarymxDTO> list = new ArrayList<AttEnsummarymxDTO>( entityList.size() );
        for ( AttEnsummarymx attEnsummarymx : entityList ) {
            list.add( toDto( attEnsummarymx ) );
        }

        return list;
    }
}
