package cn.ibizlab.ehr.webapi.mapping;

import cn.ibizlab.ehr.core.pcm.domain.PcmProfileSzyjtj;
import cn.ibizlab.ehr.webapi.dto.PcmProfileSzyjtjDTO;
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
    date = "2021-09-04T00:31:47+0800",
    comments = "version: 1.3.0.Final, compiler: javac, environment: Java 1.8.0_92 (Oracle Corporation)"
)
@Component
public class PcmProfileSzyjtjMappingImpl implements PcmProfileSzyjtjMapping {

    @Override
    public PcmProfileSzyjtj toDomain(PcmProfileSzyjtjDTO dto) {
        if ( dto == null ) {
            return null;
        }

        PcmProfileSzyjtj pcmProfileSzyjtj = new PcmProfileSzyjtj();

        Set<String> set = dto.getFocusNull();
        if ( set != null ) {
            pcmProfileSzyjtj.setFocusNull( new HashSet<String>( set ) );
        }
        Map<String, Object> map = dto.getExtensionparams();
        if ( map != null ) {
            pcmProfileSzyjtj.setExtensionparams( new HashMap<String, Object>( map ) );
        }
        if ( dto.getXh() != null ) {
            pcmProfileSzyjtj.setXh( dto.getXh() );
        }
        if ( dto.getYglx() != null ) {
            pcmProfileSzyjtj.setYglx( dto.getYglx() );
        }
        if ( dto.getPcmprofileszyjtjname() != null ) {
            pcmProfileSzyjtj.setPcmprofileszyjtjname( dto.getPcmprofileszyjtjname() );
        }
        if ( dto.getCreateman() != null ) {
            pcmProfileSzyjtj.setCreateman( dto.getCreateman() );
        }
        if ( dto.getUpdatedate() != null ) {
            pcmProfileSzyjtj.setUpdatedate( dto.getUpdatedate() );
        }
        if ( dto.getCreatedate() != null ) {
            pcmProfileSzyjtj.setCreatedate( dto.getCreatedate() );
        }
        if ( dto.getPcmprofileszyjtjid() != null ) {
            pcmProfileSzyjtj.setPcmprofileszyjtjid( dto.getPcmprofileszyjtjid() );
        }
        if ( dto.getUpdateman() != null ) {
            pcmProfileSzyjtj.setUpdateman( dto.getUpdateman() );
        }

        return pcmProfileSzyjtj;
    }

    @Override
    public PcmProfileSzyjtjDTO toDto(PcmProfileSzyjtj entity) {
        if ( entity == null ) {
            return null;
        }

        PcmProfileSzyjtjDTO pcmProfileSzyjtjDTO = new PcmProfileSzyjtjDTO();

        Map<String, Object> map = entity.getExtensionparams();
        if ( map != null ) {
            pcmProfileSzyjtjDTO.setExtensionparams( new HashMap<String, Object>( map ) );
        }
        Set<String> set = entity.getFocusNull();
        if ( set != null ) {
            pcmProfileSzyjtjDTO.setFocusNull( new HashSet<String>( set ) );
        }
        if ( entity.getXh() != null ) {
            pcmProfileSzyjtjDTO.setXh( entity.getXh() );
        }
        if ( entity.getYglx() != null ) {
            pcmProfileSzyjtjDTO.setYglx( entity.getYglx() );
        }
        if ( entity.getPcmprofileszyjtjname() != null ) {
            pcmProfileSzyjtjDTO.setPcmprofileszyjtjname( entity.getPcmprofileszyjtjname() );
        }
        if ( entity.getCreateman() != null ) {
            pcmProfileSzyjtjDTO.setCreateman( entity.getCreateman() );
        }
        if ( entity.getUpdatedate() != null ) {
            pcmProfileSzyjtjDTO.setUpdatedate( entity.getUpdatedate() );
        }
        if ( entity.getCreatedate() != null ) {
            pcmProfileSzyjtjDTO.setCreatedate( entity.getCreatedate() );
        }
        if ( entity.getPcmprofileszyjtjid() != null ) {
            pcmProfileSzyjtjDTO.setPcmprofileszyjtjid( entity.getPcmprofileszyjtjid() );
        }
        if ( entity.getUpdateman() != null ) {
            pcmProfileSzyjtjDTO.setUpdateman( entity.getUpdateman() );
        }

        return pcmProfileSzyjtjDTO;
    }

    @Override
    public List<PcmProfileSzyjtj> toDomain(List<PcmProfileSzyjtjDTO> dtoList) {
        if ( dtoList == null ) {
            return null;
        }

        List<PcmProfileSzyjtj> list = new ArrayList<PcmProfileSzyjtj>( dtoList.size() );
        for ( PcmProfileSzyjtjDTO pcmProfileSzyjtjDTO : dtoList ) {
            list.add( toDomain( pcmProfileSzyjtjDTO ) );
        }

        return list;
    }

    @Override
    public List<PcmProfileSzyjtjDTO> toDto(List<PcmProfileSzyjtj> entityList) {
        if ( entityList == null ) {
            return null;
        }

        List<PcmProfileSzyjtjDTO> list = new ArrayList<PcmProfileSzyjtjDTO>( entityList.size() );
        for ( PcmProfileSzyjtj pcmProfileSzyjtj : entityList ) {
            list.add( toDto( pcmProfileSzyjtj ) );
        }

        return list;
    }
}
