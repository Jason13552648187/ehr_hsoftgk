package cn.ibizlab.ehr.webapi.mapping;

import cn.ibizlab.ehr.core.pcm.domain.PcmZjdyzw;
import cn.ibizlab.ehr.webapi.dto.PcmZjdyzwDTO;
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
public class PcmZjdyzwMappingImpl implements PcmZjdyzwMapping {

    @Override
    public PcmZjdyzw toDomain(PcmZjdyzwDTO dto) {
        if ( dto == null ) {
            return null;
        }

        PcmZjdyzw pcmZjdyzw = new PcmZjdyzw();

        Set<String> set = dto.getFocusNull();
        if ( set != null ) {
            pcmZjdyzw.setFocusNull( new HashSet<String>( set ) );
        }
        Map<String, Object> map = dto.getExtensionparams();
        if ( map != null ) {
            pcmZjdyzw.setExtensionparams( new HashMap<String, Object>( map ) );
        }
        if ( dto.getPcmzjdyzwname() != null ) {
            pcmZjdyzw.setPcmzjdyzwname( dto.getPcmzjdyzwname() );
        }
        if ( dto.getOrmdutyid() != null ) {
            pcmZjdyzw.setOrmdutyid( dto.getOrmdutyid() );
        }
        if ( dto.getOrmrankid() != null ) {
            pcmZjdyzw.setOrmrankid( dto.getOrmrankid() );
        }
        if ( dto.getCreatedate() != null ) {
            pcmZjdyzw.setCreatedate( dto.getCreatedate() );
        }
        if ( dto.getUpdateman() != null ) {
            pcmZjdyzw.setUpdateman( dto.getUpdateman() );
        }
        if ( dto.getUpdatedate() != null ) {
            pcmZjdyzw.setUpdatedate( dto.getUpdatedate() );
        }
        if ( dto.getPcmzjdyzwid() != null ) {
            pcmZjdyzw.setPcmzjdyzwid( dto.getPcmzjdyzwid() );
        }
        if ( dto.getCreateman() != null ) {
            pcmZjdyzw.setCreateman( dto.getCreateman() );
        }
        if ( dto.getOrmrankname() != null ) {
            pcmZjdyzw.setOrmrankname( dto.getOrmrankname() );
        }
        if ( dto.getOrmdutyname() != null ) {
            pcmZjdyzw.setOrmdutyname( dto.getOrmdutyname() );
        }

        return pcmZjdyzw;
    }

    @Override
    public PcmZjdyzwDTO toDto(PcmZjdyzw entity) {
        if ( entity == null ) {
            return null;
        }

        PcmZjdyzwDTO pcmZjdyzwDTO = new PcmZjdyzwDTO();

        Map<String, Object> map = entity.getExtensionparams();
        if ( map != null ) {
            pcmZjdyzwDTO.setExtensionparams( new HashMap<String, Object>( map ) );
        }
        Set<String> set = entity.getFocusNull();
        if ( set != null ) {
            pcmZjdyzwDTO.setFocusNull( new HashSet<String>( set ) );
        }
        if ( entity.getPcmzjdyzwname() != null ) {
            pcmZjdyzwDTO.setPcmzjdyzwname( entity.getPcmzjdyzwname() );
        }
        if ( entity.getOrmdutyid() != null ) {
            pcmZjdyzwDTO.setOrmdutyid( entity.getOrmdutyid() );
        }
        if ( entity.getOrmrankid() != null ) {
            pcmZjdyzwDTO.setOrmrankid( entity.getOrmrankid() );
        }
        if ( entity.getCreatedate() != null ) {
            pcmZjdyzwDTO.setCreatedate( entity.getCreatedate() );
        }
        if ( entity.getUpdateman() != null ) {
            pcmZjdyzwDTO.setUpdateman( entity.getUpdateman() );
        }
        if ( entity.getUpdatedate() != null ) {
            pcmZjdyzwDTO.setUpdatedate( entity.getUpdatedate() );
        }
        if ( entity.getPcmzjdyzwid() != null ) {
            pcmZjdyzwDTO.setPcmzjdyzwid( entity.getPcmzjdyzwid() );
        }
        if ( entity.getCreateman() != null ) {
            pcmZjdyzwDTO.setCreateman( entity.getCreateman() );
        }
        if ( entity.getOrmrankname() != null ) {
            pcmZjdyzwDTO.setOrmrankname( entity.getOrmrankname() );
        }
        if ( entity.getOrmdutyname() != null ) {
            pcmZjdyzwDTO.setOrmdutyname( entity.getOrmdutyname() );
        }

        return pcmZjdyzwDTO;
    }

    @Override
    public List<PcmZjdyzw> toDomain(List<PcmZjdyzwDTO> dtoList) {
        if ( dtoList == null ) {
            return null;
        }

        List<PcmZjdyzw> list = new ArrayList<PcmZjdyzw>( dtoList.size() );
        for ( PcmZjdyzwDTO pcmZjdyzwDTO : dtoList ) {
            list.add( toDomain( pcmZjdyzwDTO ) );
        }

        return list;
    }

    @Override
    public List<PcmZjdyzwDTO> toDto(List<PcmZjdyzw> entityList) {
        if ( entityList == null ) {
            return null;
        }

        List<PcmZjdyzwDTO> list = new ArrayList<PcmZjdyzwDTO>( entityList.size() );
        for ( PcmZjdyzw pcmZjdyzw : entityList ) {
            list.add( toDto( pcmZjdyzw ) );
        }

        return list;
    }
}
