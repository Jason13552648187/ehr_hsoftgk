package cn.ibizlab.ehr.webapi.mapping;

import cn.ibizlab.ehr.core.pcm.domain.PcmProfileFj;
import cn.ibizlab.ehr.webapi.dto.PcmProfileFjDTO;
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
public class PcmProfileFjMappingImpl implements PcmProfileFjMapping {

    @Override
    public PcmProfileFj toDomain(PcmProfileFjDTO dto) {
        if ( dto == null ) {
            return null;
        }

        PcmProfileFj pcmProfileFj = new PcmProfileFj();

        Set<String> set = dto.getFocusNull();
        if ( set != null ) {
            pcmProfileFj.setFocusNull( new HashSet<String>( set ) );
        }
        Map<String, Object> map = dto.getExtensionparams();
        if ( map != null ) {
            pcmProfileFj.setExtensionparams( new HashMap<String, Object>( map ) );
        }
        if ( dto.getFjname() != null ) {
            pcmProfileFj.setFjname( dto.getFjname() );
        }
        if ( dto.getFj() != null ) {
            pcmProfileFj.setFj( dto.getFj() );
        }
        if ( dto.getPcmprofilefjname() != null ) {
            pcmProfileFj.setPcmprofilefjname( dto.getPcmprofilefjname() );
        }
        if ( dto.getCreatedate() != null ) {
            pcmProfileFj.setCreatedate( dto.getCreatedate() );
        }
        if ( dto.getCreateman() != null ) {
            pcmProfileFj.setCreateman( dto.getCreateman() );
        }
        if ( dto.getPcmprofilefjid() != null ) {
            pcmProfileFj.setPcmprofilefjid( dto.getPcmprofilefjid() );
        }
        if ( dto.getUpdateman() != null ) {
            pcmProfileFj.setUpdateman( dto.getUpdateman() );
        }
        if ( dto.getUpdatedate() != null ) {
            pcmProfileFj.setUpdatedate( dto.getUpdatedate() );
        }

        return pcmProfileFj;
    }

    @Override
    public PcmProfileFjDTO toDto(PcmProfileFj entity) {
        if ( entity == null ) {
            return null;
        }

        PcmProfileFjDTO pcmProfileFjDTO = new PcmProfileFjDTO();

        Map<String, Object> map = entity.getExtensionparams();
        if ( map != null ) {
            pcmProfileFjDTO.setExtensionparams( new HashMap<String, Object>( map ) );
        }
        Set<String> set = entity.getFocusNull();
        if ( set != null ) {
            pcmProfileFjDTO.setFocusNull( new HashSet<String>( set ) );
        }
        if ( entity.getFjname() != null ) {
            pcmProfileFjDTO.setFjname( entity.getFjname() );
        }
        if ( entity.getFj() != null ) {
            pcmProfileFjDTO.setFj( entity.getFj() );
        }
        if ( entity.getPcmprofilefjname() != null ) {
            pcmProfileFjDTO.setPcmprofilefjname( entity.getPcmprofilefjname() );
        }
        if ( entity.getCreatedate() != null ) {
            pcmProfileFjDTO.setCreatedate( entity.getCreatedate() );
        }
        if ( entity.getCreateman() != null ) {
            pcmProfileFjDTO.setCreateman( entity.getCreateman() );
        }
        if ( entity.getPcmprofilefjid() != null ) {
            pcmProfileFjDTO.setPcmprofilefjid( entity.getPcmprofilefjid() );
        }
        if ( entity.getUpdateman() != null ) {
            pcmProfileFjDTO.setUpdateman( entity.getUpdateman() );
        }
        if ( entity.getUpdatedate() != null ) {
            pcmProfileFjDTO.setUpdatedate( entity.getUpdatedate() );
        }

        return pcmProfileFjDTO;
    }

    @Override
    public List<PcmProfileFj> toDomain(List<PcmProfileFjDTO> dtoList) {
        if ( dtoList == null ) {
            return null;
        }

        List<PcmProfileFj> list = new ArrayList<PcmProfileFj>( dtoList.size() );
        for ( PcmProfileFjDTO pcmProfileFjDTO : dtoList ) {
            list.add( toDomain( pcmProfileFjDTO ) );
        }

        return list;
    }

    @Override
    public List<PcmProfileFjDTO> toDto(List<PcmProfileFj> entityList) {
        if ( entityList == null ) {
            return null;
        }

        List<PcmProfileFjDTO> list = new ArrayList<PcmProfileFjDTO>( entityList.size() );
        for ( PcmProfileFj pcmProfileFj : entityList ) {
            list.add( toDto( pcmProfileFj ) );
        }

        return list;
    }
}
