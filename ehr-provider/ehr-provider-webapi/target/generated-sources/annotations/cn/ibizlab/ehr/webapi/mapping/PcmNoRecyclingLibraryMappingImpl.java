package cn.ibizlab.ehr.webapi.mapping;

import cn.ibizlab.ehr.core.pcm.domain.PcmNoRecyclingLibrary;
import cn.ibizlab.ehr.webapi.dto.PcmNoRecyclingLibraryDTO;
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
    date = "2021-09-04T00:31:53+0800",
    comments = "version: 1.3.0.Final, compiler: javac, environment: Java 1.8.0_92 (Oracle Corporation)"
)
@Component
public class PcmNoRecyclingLibraryMappingImpl implements PcmNoRecyclingLibraryMapping {

    @Override
    public PcmNoRecyclingLibrary toDomain(PcmNoRecyclingLibraryDTO dto) {
        if ( dto == null ) {
            return null;
        }

        PcmNoRecyclingLibrary pcmNoRecyclingLibrary = new PcmNoRecyclingLibrary();

        Set<String> set = dto.getFocusNull();
        if ( set != null ) {
            pcmNoRecyclingLibrary.setFocusNull( new HashSet<String>( set ) );
        }
        Map<String, Object> map = dto.getExtensionparams();
        if ( map != null ) {
            pcmNoRecyclingLibrary.setExtensionparams( new HashMap<String, Object>( map ) );
        }
        if ( dto.getYglx() != null ) {
            pcmNoRecyclingLibrary.setYglx( dto.getYglx() );
        }
        if ( dto.getOrmorgid() != null ) {
            pcmNoRecyclingLibrary.setOrmorgid( dto.getOrmorgid() );
        }
        if ( dto.getPcmnorecyclinglibraryname() != null ) {
            pcmNoRecyclingLibrary.setPcmnorecyclinglibraryname( dto.getPcmnorecyclinglibraryname() );
        }
        if ( dto.getUseful() != null ) {
            pcmNoRecyclingLibrary.setUseful( dto.getUseful() );
        }
        if ( dto.getYgbh() != null ) {
            pcmNoRecyclingLibrary.setYgbh( dto.getYgbh() );
        }
        if ( dto.getPcmnorecyclinglibraryid() != null ) {
            pcmNoRecyclingLibrary.setPcmnorecyclinglibraryid( dto.getPcmnorecyclinglibraryid() );
        }
        if ( dto.getUpdateman() != null ) {
            pcmNoRecyclingLibrary.setUpdateman( dto.getUpdateman() );
        }
        if ( dto.getCreateman() != null ) {
            pcmNoRecyclingLibrary.setCreateman( dto.getCreateman() );
        }
        if ( dto.getCreatedate() != null ) {
            pcmNoRecyclingLibrary.setCreatedate( dto.getCreatedate() );
        }
        if ( dto.getUpdatedate() != null ) {
            pcmNoRecyclingLibrary.setUpdatedate( dto.getUpdatedate() );
        }

        return pcmNoRecyclingLibrary;
    }

    @Override
    public PcmNoRecyclingLibraryDTO toDto(PcmNoRecyclingLibrary entity) {
        if ( entity == null ) {
            return null;
        }

        PcmNoRecyclingLibraryDTO pcmNoRecyclingLibraryDTO = new PcmNoRecyclingLibraryDTO();

        Map<String, Object> map = entity.getExtensionparams();
        if ( map != null ) {
            pcmNoRecyclingLibraryDTO.setExtensionparams( new HashMap<String, Object>( map ) );
        }
        Set<String> set = entity.getFocusNull();
        if ( set != null ) {
            pcmNoRecyclingLibraryDTO.setFocusNull( new HashSet<String>( set ) );
        }
        if ( entity.getYglx() != null ) {
            pcmNoRecyclingLibraryDTO.setYglx( entity.getYglx() );
        }
        if ( entity.getOrmorgid() != null ) {
            pcmNoRecyclingLibraryDTO.setOrmorgid( entity.getOrmorgid() );
        }
        if ( entity.getPcmnorecyclinglibraryname() != null ) {
            pcmNoRecyclingLibraryDTO.setPcmnorecyclinglibraryname( entity.getPcmnorecyclinglibraryname() );
        }
        if ( entity.getUseful() != null ) {
            pcmNoRecyclingLibraryDTO.setUseful( entity.getUseful() );
        }
        if ( entity.getYgbh() != null ) {
            pcmNoRecyclingLibraryDTO.setYgbh( entity.getYgbh() );
        }
        if ( entity.getPcmnorecyclinglibraryid() != null ) {
            pcmNoRecyclingLibraryDTO.setPcmnorecyclinglibraryid( entity.getPcmnorecyclinglibraryid() );
        }
        if ( entity.getUpdateman() != null ) {
            pcmNoRecyclingLibraryDTO.setUpdateman( entity.getUpdateman() );
        }
        if ( entity.getCreateman() != null ) {
            pcmNoRecyclingLibraryDTO.setCreateman( entity.getCreateman() );
        }
        if ( entity.getCreatedate() != null ) {
            pcmNoRecyclingLibraryDTO.setCreatedate( entity.getCreatedate() );
        }
        if ( entity.getUpdatedate() != null ) {
            pcmNoRecyclingLibraryDTO.setUpdatedate( entity.getUpdatedate() );
        }

        return pcmNoRecyclingLibraryDTO;
    }

    @Override
    public List<PcmNoRecyclingLibrary> toDomain(List<PcmNoRecyclingLibraryDTO> dtoList) {
        if ( dtoList == null ) {
            return null;
        }

        List<PcmNoRecyclingLibrary> list = new ArrayList<PcmNoRecyclingLibrary>( dtoList.size() );
        for ( PcmNoRecyclingLibraryDTO pcmNoRecyclingLibraryDTO : dtoList ) {
            list.add( toDomain( pcmNoRecyclingLibraryDTO ) );
        }

        return list;
    }

    @Override
    public List<PcmNoRecyclingLibraryDTO> toDto(List<PcmNoRecyclingLibrary> entityList) {
        if ( entityList == null ) {
            return null;
        }

        List<PcmNoRecyclingLibraryDTO> list = new ArrayList<PcmNoRecyclingLibraryDTO>( entityList.size() );
        for ( PcmNoRecyclingLibrary pcmNoRecyclingLibrary : entityList ) {
            list.add( toDto( pcmNoRecyclingLibrary ) );
        }

        return list;
    }
}
