package cn.ibizlab.ehr.webapi.mapping;

import cn.ibizlab.ehr.core.pcm.domain.PcmXkml;
import cn.ibizlab.ehr.webapi.dto.PcmXkmlDTO;
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
    date = "2021-09-04T00:31:51+0800",
    comments = "version: 1.3.0.Final, compiler: javac, environment: Java 1.8.0_92 (Oracle Corporation)"
)
@Component
public class PcmXkmlMappingImpl implements PcmXkmlMapping {

    @Override
    public PcmXkml toDomain(PcmXkmlDTO dto) {
        if ( dto == null ) {
            return null;
        }

        PcmXkml pcmXkml = new PcmXkml();

        Set<String> set = dto.getFocusNull();
        if ( set != null ) {
            pcmXkml.setFocusNull( new HashSet<String>( set ) );
        }
        Map<String, Object> map = dto.getExtensionparams();
        if ( map != null ) {
            pcmXkml.setExtensionparams( new HashMap<String, Object>( map ) );
        }
        if ( dto.getNd() != null ) {
            pcmXkml.setNd( dto.getNd() );
        }
        if ( dto.getPcmxkmlname() != null ) {
            pcmXkml.setPcmxkmlname( dto.getPcmxkmlname() );
        }
        if ( dto.getXh() != null ) {
            pcmXkml.setXh( dto.getXh() );
        }
        if ( dto.getXkml() != null ) {
            pcmXkml.setXkml( dto.getXkml() );
        }
        if ( dto.getCreatedate() != null ) {
            pcmXkml.setCreatedate( dto.getCreatedate() );
        }
        if ( dto.getUpdateman() != null ) {
            pcmXkml.setUpdateman( dto.getUpdateman() );
        }
        if ( dto.getPcmxkmlid() != null ) {
            pcmXkml.setPcmxkmlid( dto.getPcmxkmlid() );
        }
        if ( dto.getUpdatedate() != null ) {
            pcmXkml.setUpdatedate( dto.getUpdatedate() );
        }
        if ( dto.getCreateman() != null ) {
            pcmXkml.setCreateman( dto.getCreateman() );
        }

        return pcmXkml;
    }

    @Override
    public PcmXkmlDTO toDto(PcmXkml entity) {
        if ( entity == null ) {
            return null;
        }

        PcmXkmlDTO pcmXkmlDTO = new PcmXkmlDTO();

        Map<String, Object> map = entity.getExtensionparams();
        if ( map != null ) {
            pcmXkmlDTO.setExtensionparams( new HashMap<String, Object>( map ) );
        }
        Set<String> set = entity.getFocusNull();
        if ( set != null ) {
            pcmXkmlDTO.setFocusNull( new HashSet<String>( set ) );
        }
        if ( entity.getNd() != null ) {
            pcmXkmlDTO.setNd( entity.getNd() );
        }
        if ( entity.getPcmxkmlname() != null ) {
            pcmXkmlDTO.setPcmxkmlname( entity.getPcmxkmlname() );
        }
        if ( entity.getXh() != null ) {
            pcmXkmlDTO.setXh( entity.getXh() );
        }
        if ( entity.getXkml() != null ) {
            pcmXkmlDTO.setXkml( entity.getXkml() );
        }
        if ( entity.getCreatedate() != null ) {
            pcmXkmlDTO.setCreatedate( entity.getCreatedate() );
        }
        if ( entity.getUpdateman() != null ) {
            pcmXkmlDTO.setUpdateman( entity.getUpdateman() );
        }
        if ( entity.getPcmxkmlid() != null ) {
            pcmXkmlDTO.setPcmxkmlid( entity.getPcmxkmlid() );
        }
        if ( entity.getUpdatedate() != null ) {
            pcmXkmlDTO.setUpdatedate( entity.getUpdatedate() );
        }
        if ( entity.getCreateman() != null ) {
            pcmXkmlDTO.setCreateman( entity.getCreateman() );
        }

        return pcmXkmlDTO;
    }

    @Override
    public List<PcmXkml> toDomain(List<PcmXkmlDTO> dtoList) {
        if ( dtoList == null ) {
            return null;
        }

        List<PcmXkml> list = new ArrayList<PcmXkml>( dtoList.size() );
        for ( PcmXkmlDTO pcmXkmlDTO : dtoList ) {
            list.add( toDomain( pcmXkmlDTO ) );
        }

        return list;
    }

    @Override
    public List<PcmXkmlDTO> toDto(List<PcmXkml> entityList) {
        if ( entityList == null ) {
            return null;
        }

        List<PcmXkmlDTO> list = new ArrayList<PcmXkmlDTO>( entityList.size() );
        for ( PcmXkml pcmXkml : entityList ) {
            list.add( toDto( pcmXkml ) );
        }

        return list;
    }
}
