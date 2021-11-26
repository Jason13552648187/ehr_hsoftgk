package cn.ibizlab.ehr.webapi.mapping;

import cn.ibizlab.ehr.core.pcm.domain.PcmZsgl;
import cn.ibizlab.ehr.webapi.dto.PcmZsglDTO;
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
    date = "2021-09-04T00:31:48+0800",
    comments = "version: 1.3.0.Final, compiler: javac, environment: Java 1.8.0_92 (Oracle Corporation)"
)
@Component
public class PcmZsglMappingImpl implements PcmZsglMapping {

    @Override
    public PcmZsgl toDomain(PcmZsglDTO dto) {
        if ( dto == null ) {
            return null;
        }

        PcmZsgl pcmZsgl = new PcmZsgl();

        Set<String> set = dto.getFocusNull();
        if ( set != null ) {
            pcmZsgl.setFocusNull( new HashSet<String>( set ) );
        }
        Map<String, Object> map = dto.getExtensionparams();
        if ( map != null ) {
            pcmZsgl.setExtensionparams( new HashMap<String, Object>( map ) );
        }
        if ( dto.getZjname() != null ) {
            pcmZsgl.setZjname( dto.getZjname() );
        }
        if ( dto.getZs() != null ) {
            pcmZsgl.setZs( dto.getZs() );
        }
        if ( dto.getXh() != null ) {
            pcmZsgl.setXh( dto.getXh() );
        }
        if ( dto.getZzname() != null ) {
            pcmZsgl.setZzname( dto.getZzname() );
        }
        if ( dto.getZjid() != null ) {
            pcmZsgl.setZjid( dto.getZjid() );
        }
        if ( dto.getZzid() != null ) {
            pcmZsgl.setZzid( dto.getZzid() );
        }
        if ( dto.getPcmzsglname() != null ) {
            pcmZsgl.setPcmzsglname( dto.getPcmzsglname() );
        }
        if ( dto.getUpdatedate() != null ) {
            pcmZsgl.setUpdatedate( dto.getUpdatedate() );
        }
        if ( dto.getPcmzsglid() != null ) {
            pcmZsgl.setPcmzsglid( dto.getPcmzsglid() );
        }
        if ( dto.getCreatedate() != null ) {
            pcmZsgl.setCreatedate( dto.getCreatedate() );
        }
        if ( dto.getUpdateman() != null ) {
            pcmZsgl.setUpdateman( dto.getUpdateman() );
        }
        if ( dto.getCreateman() != null ) {
            pcmZsgl.setCreateman( dto.getCreateman() );
        }

        return pcmZsgl;
    }

    @Override
    public PcmZsglDTO toDto(PcmZsgl entity) {
        if ( entity == null ) {
            return null;
        }

        PcmZsglDTO pcmZsglDTO = new PcmZsglDTO();

        Map<String, Object> map = entity.getExtensionparams();
        if ( map != null ) {
            pcmZsglDTO.setExtensionparams( new HashMap<String, Object>( map ) );
        }
        Set<String> set = entity.getFocusNull();
        if ( set != null ) {
            pcmZsglDTO.setFocusNull( new HashSet<String>( set ) );
        }
        if ( entity.getZjname() != null ) {
            pcmZsglDTO.setZjname( entity.getZjname() );
        }
        if ( entity.getZs() != null ) {
            pcmZsglDTO.setZs( entity.getZs() );
        }
        if ( entity.getXh() != null ) {
            pcmZsglDTO.setXh( entity.getXh() );
        }
        if ( entity.getZzname() != null ) {
            pcmZsglDTO.setZzname( entity.getZzname() );
        }
        if ( entity.getZjid() != null ) {
            pcmZsglDTO.setZjid( entity.getZjid() );
        }
        if ( entity.getZzid() != null ) {
            pcmZsglDTO.setZzid( entity.getZzid() );
        }
        if ( entity.getPcmzsglname() != null ) {
            pcmZsglDTO.setPcmzsglname( entity.getPcmzsglname() );
        }
        if ( entity.getUpdatedate() != null ) {
            pcmZsglDTO.setUpdatedate( entity.getUpdatedate() );
        }
        if ( entity.getPcmzsglid() != null ) {
            pcmZsglDTO.setPcmzsglid( entity.getPcmzsglid() );
        }
        if ( entity.getCreatedate() != null ) {
            pcmZsglDTO.setCreatedate( entity.getCreatedate() );
        }
        if ( entity.getUpdateman() != null ) {
            pcmZsglDTO.setUpdateman( entity.getUpdateman() );
        }
        if ( entity.getCreateman() != null ) {
            pcmZsglDTO.setCreateman( entity.getCreateman() );
        }

        return pcmZsglDTO;
    }

    @Override
    public List<PcmZsgl> toDomain(List<PcmZsglDTO> dtoList) {
        if ( dtoList == null ) {
            return null;
        }

        List<PcmZsgl> list = new ArrayList<PcmZsgl>( dtoList.size() );
        for ( PcmZsglDTO pcmZsglDTO : dtoList ) {
            list.add( toDomain( pcmZsglDTO ) );
        }

        return list;
    }

    @Override
    public List<PcmZsglDTO> toDto(List<PcmZsgl> entityList) {
        if ( entityList == null ) {
            return null;
        }

        List<PcmZsglDTO> list = new ArrayList<PcmZsglDTO>( entityList.size() );
        for ( PcmZsgl pcmZsgl : entityList ) {
            list.add( toDto( pcmZsgl ) );
        }

        return list;
    }
}
