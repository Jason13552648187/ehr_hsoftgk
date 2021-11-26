package cn.ibizlab.ehr.webapi.mapping;

import cn.ibizlab.ehr.core.pcm.domain.PcmGbhmc;
import cn.ibizlab.ehr.webapi.dto.PcmGbhmcDTO;
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
public class PcmGbhmcMappingImpl implements PcmGbhmcMapping {

    @Override
    public PcmGbhmc toDomain(PcmGbhmcDTO dto) {
        if ( dto == null ) {
            return null;
        }

        PcmGbhmc pcmGbhmc = new PcmGbhmc();

        Set<String> set = dto.getFocusNull();
        if ( set != null ) {
            pcmGbhmc.setFocusNull( new HashSet<String>( set ) );
        }
        Map<String, Object> map = dto.getExtensionparams();
        if ( map != null ) {
            pcmGbhmc.setExtensionparams( new HashMap<String, Object>( map ) );
        }
        if ( dto.getOrdervalue() != null ) {
            pcmGbhmc.setOrdervalue( dto.getOrdervalue() );
        }
        if ( dto.getDaxl() != null ) {
            pcmGbhmc.setDaxl( dto.getDaxl() );
        }
        if ( dto.getRznldq() != null ) {
            pcmGbhmc.setRznldq( dto.getRznldq() );
        }
        if ( dto.getZyjszw() != null ) {
            pcmGbhmc.setZyjszw( dto.getZyjszw() );
        }
        if ( dto.getIsleaderteam() != null ) {
            pcmGbhmc.setIsleaderteam( dto.getIsleaderteam() );
        }
        if ( dto.getMz() != null ) {
            pcmGbhmc.setMz( dto.getMz() );
        }
        if ( dto.getHigheducation() != null ) {
            pcmGbhmc.setHigheducation( dto.getHigheducation() );
        }
        if ( dto.getZyzg2() != null ) {
            pcmGbhmc.setZyzg2( dto.getZyzg2() );
        }
        if ( dto.getDyxlsszy2() != null ) {
            pcmGbhmc.setDyxlsszy2( dto.getDyxlsszy2() );
        }
        if ( dto.getZt2() != null ) {
            pcmGbhmc.setZt2( dto.getZt2() );
        }
        if ( dto.getJlspzt() != null ) {
            pcmGbhmc.setJlspzt( dto.getJlspzt() );
        }
        if ( dto.getPimpersonname() != null ) {
            pcmGbhmc.setPimpersonname( dto.getPimpersonname() );
        }
        if ( dto.getLgnx2() != null ) {
            pcmGbhmc.setLgnx2( dto.getLgnx2() );
        }
        if ( dto.getRankrq() != null ) {
            pcmGbhmc.setRankrq( dto.getRankrq() );
        }
        if ( dto.getRzsj() != null ) {
            pcmGbhmc.setRzsj( dto.getRzsj() );
        }
        if ( dto.getSgksrq2() != null ) {
            pcmGbhmc.setSgksrq2( dto.getSgksrq2() );
        }
        if ( dto.getRzdq() != null ) {
            pcmGbhmc.setRzdq( dto.getRzdq() );
        }
        if ( dto.getJlss() != null ) {
            pcmGbhmc.setJlss( dto.getJlss() );
        }
        if ( dto.getDardsj() != null ) {
            pcmGbhmc.setDardsj( dto.getDardsj() );
        }
        if ( dto.getJlglbh() != null ) {
            pcmGbhmc.setJlglbh( dto.getJlglbh() );
        }
        if ( dto.getZwrq() != null ) {
            pcmGbhmc.setZwrq( dto.getZwrq() );
        }
        if ( dto.getCfyxjsrq2() != null ) {
            pcmGbhmc.setCfyxjsrq2( dto.getCfyxjsrq2() );
        }
        if ( dto.getPostexpiration2() != null ) {
            pcmGbhmc.setPostexpiration2( dto.getPostexpiration2() );
        }
        if ( dto.getKhcjtx2() != null ) {
            pcmGbhmc.setKhcjtx2( dto.getKhcjtx2() );
        }
        if ( dto.getZjnx2() != null ) {
            pcmGbhmc.setZjnx2( dto.getZjnx2() );
        }
        if ( dto.getHqxlbyyx2() != null ) {
            pcmGbhmc.setHqxlbyyx2( dto.getHqxlbyyx2() );
        }
        if ( dto.getRank() != null ) {
            pcmGbhmc.setRank( dto.getRank() );
        }
        if ( dto.getGw() != null ) {
            pcmGbhmc.setGw( dto.getGw() );
        }
        if ( dto.getZjhm() != null ) {
            pcmGbhmc.setZjhm( dto.getZjhm() );
        }
        if ( dto.getOrmorgsectorname() != null ) {
            pcmGbhmc.setOrmorgsectorname( dto.getOrmorgsectorname() );
        }
        if ( dto.getJzrz2() != null ) {
            pcmGbhmc.setJzrz2( dto.getJzrz2() );
        }
        if ( dto.getRznldqColor() != null ) {
            pcmGbhmc.setRznldqColor( dto.getRznldqColor() );
        }
        if ( dto.getZw() != null ) {
            pcmGbhmc.setZw( dto.getZw() );
        }
        if ( dto.getKhcj() != null ) {
            pcmGbhmc.setKhcj( dto.getKhcj() );
        }
        if ( dto.getDacsrq() != null ) {
            pcmGbhmc.setDacsrq( dto.getDacsrq() );
        }
        if ( dto.getZzdzs() != null ) {
            pcmGbhmc.setZzdzs( dto.getZzdzs() );
        }
        if ( dto.getXb() != null ) {
            pcmGbhmc.setXb( dto.getXb() );
        }
        if ( dto.getLgnx2Color() != null ) {
            pcmGbhmc.setLgnx2Color( dto.getLgnx2Color() );
        }
        if ( dto.getHqxlsxzy2() != null ) {
            pcmGbhmc.setHqxlsxzy2( dto.getHqxlsxzy2() );
        }
        if ( dto.getDacjgzsj() != null ) {
            pcmGbhmc.setDacjgzsj( dto.getDacjgzsj() );
        }
        if ( dto.getRdsj() != null ) {
            pcmGbhmc.setRdsj( dto.getRdsj() );
        }
        if ( dto.getLgkssj2() != null ) {
            pcmGbhmc.setLgkssj2( dto.getLgkssj2() );
        }
        if ( dto.getSyczjrq2() != null ) {
            pcmGbhmc.setSyczjrq2( dto.getSyczjrq2() );
        }
        if ( dto.getJg() != null ) {
            pcmGbhmc.setJg( dto.getJg() );
        }
        if ( dto.getKhcjtx() != null ) {
            pcmGbhmc.setKhcjtx( dto.getKhcjtx() );
        }
        if ( dto.getJlczz() != null ) {
            pcmGbhmc.setJlczz( dto.getJlczz() );
        }
        if ( dto.getPimpersonid() != null ) {
            pcmGbhmc.setPimpersonid( dto.getPimpersonid() );
        }
        if ( dto.getRznx() != null ) {
            pcmGbhmc.setRznx( dto.getRznx() );
        }
        if ( dto.getRznx2() != null ) {
            pcmGbhmc.setRznx2( dto.getRznx2() );
        }
        if ( dto.getOrgtype() != null ) {
            pcmGbhmc.setOrgtype( dto.getOrgtype() );
        }
        if ( dto.getRtsj() != null ) {
            pcmGbhmc.setRtsj( dto.getRtsj() );
        }
        if ( dto.getZzmm() != null ) {
            pcmGbhmc.setZzmm( dto.getZzmm() );
        }
        if ( dto.getFirsteducation() != null ) {
            pcmGbhmc.setFirsteducation( dto.getFirsteducation() );
        }
        if ( dto.getDzjbjsj() != null ) {
            pcmGbhmc.setDzjbjsj( dto.getDzjbjsj() );
        }
        if ( dto.getYgbh() != null ) {
            pcmGbhmc.setYgbh( dto.getYgbh() );
        }
        if ( dto.getNl() != null ) {
            pcmGbhmc.setNl( dto.getNl() );
        }
        if ( dto.getZwnx2() != null ) {
            pcmGbhmc.setZwnx2( dto.getZwnx2() );
        }
        if ( dto.getDyxlbysj2() != null ) {
            pcmGbhmc.setDyxlbysj2( dto.getDyxlbysj2() );
        }
        if ( dto.getOrmorgsectorid() != null ) {
            pcmGbhmc.setOrmorgsectorid( dto.getOrmorgsectorid() );
        }
        if ( dto.getOrmorgid() != null ) {
            pcmGbhmc.setOrmorgid( dto.getOrmorgid() );
        }
        if ( dto.getOrmorgname() != null ) {
            pcmGbhmc.setOrmorgname( dto.getOrmorgname() );
        }
        if ( dto.getSyczjrq() != null ) {
            pcmGbhmc.setSyczjrq( dto.getSyczjrq() );
        }
        if ( dto.getCjgzsj() != null ) {
            pcmGbhmc.setCjgzsj( dto.getCjgzsj() );
        }
        if ( dto.getSgjsrq2() != null ) {
            pcmGbhmc.setSgjsrq2( dto.getSgjsrq2() );
        }
        if ( dto.getYgzt() != null ) {
            pcmGbhmc.setYgzt( dto.getYgzt() );
        }
        if ( dto.getCsrq() != null ) {
            pcmGbhmc.setCsrq( dto.getCsrq() );
        }
        if ( dto.getDyxlbyyx2() != null ) {
            pcmGbhmc.setDyxlbyyx2( dto.getDyxlbyyx2() );
        }
        if ( dto.getZgcode() != null ) {
            pcmGbhmc.setZgcode( dto.getZgcode() );
        }
        if ( dto.getOrgid() != null ) {
            pcmGbhmc.setOrgid( dto.getOrgid() );
        }

        return pcmGbhmc;
    }

    @Override
    public PcmGbhmcDTO toDto(PcmGbhmc entity) {
        if ( entity == null ) {
            return null;
        }

        PcmGbhmcDTO pcmGbhmcDTO = new PcmGbhmcDTO();

        Map<String, Object> map = entity.getExtensionparams();
        if ( map != null ) {
            pcmGbhmcDTO.setExtensionparams( new HashMap<String, Object>( map ) );
        }
        Set<String> set = entity.getFocusNull();
        if ( set != null ) {
            pcmGbhmcDTO.setFocusNull( new HashSet<String>( set ) );
        }
        if ( entity.getOrdervalue() != null ) {
            pcmGbhmcDTO.setOrdervalue( entity.getOrdervalue() );
        }
        if ( entity.getDaxl() != null ) {
            pcmGbhmcDTO.setDaxl( entity.getDaxl() );
        }
        if ( entity.getRznldq() != null ) {
            pcmGbhmcDTO.setRznldq( entity.getRznldq() );
        }
        if ( entity.getZyjszw() != null ) {
            pcmGbhmcDTO.setZyjszw( entity.getZyjszw() );
        }
        if ( entity.getIsleaderteam() != null ) {
            pcmGbhmcDTO.setIsleaderteam( entity.getIsleaderteam() );
        }
        if ( entity.getMz() != null ) {
            pcmGbhmcDTO.setMz( entity.getMz() );
        }
        if ( entity.getHigheducation() != null ) {
            pcmGbhmcDTO.setHigheducation( entity.getHigheducation() );
        }
        if ( entity.getZyzg2() != null ) {
            pcmGbhmcDTO.setZyzg2( entity.getZyzg2() );
        }
        if ( entity.getDyxlsszy2() != null ) {
            pcmGbhmcDTO.setDyxlsszy2( entity.getDyxlsszy2() );
        }
        if ( entity.getZt2() != null ) {
            pcmGbhmcDTO.setZt2( entity.getZt2() );
        }
        if ( entity.getJlspzt() != null ) {
            pcmGbhmcDTO.setJlspzt( entity.getJlspzt() );
        }
        if ( entity.getPimpersonname() != null ) {
            pcmGbhmcDTO.setPimpersonname( entity.getPimpersonname() );
        }
        if ( entity.getLgnx2() != null ) {
            pcmGbhmcDTO.setLgnx2( entity.getLgnx2() );
        }
        if ( entity.getRankrq() != null ) {
            pcmGbhmcDTO.setRankrq( entity.getRankrq() );
        }
        if ( entity.getRzsj() != null ) {
            pcmGbhmcDTO.setRzsj( entity.getRzsj() );
        }
        if ( entity.getSgksrq2() != null ) {
            pcmGbhmcDTO.setSgksrq2( entity.getSgksrq2() );
        }
        if ( entity.getRzdq() != null ) {
            pcmGbhmcDTO.setRzdq( entity.getRzdq() );
        }
        if ( entity.getJlss() != null ) {
            pcmGbhmcDTO.setJlss( entity.getJlss() );
        }
        if ( entity.getDardsj() != null ) {
            pcmGbhmcDTO.setDardsj( entity.getDardsj() );
        }
        if ( entity.getJlglbh() != null ) {
            pcmGbhmcDTO.setJlglbh( entity.getJlglbh() );
        }
        if ( entity.getZwrq() != null ) {
            pcmGbhmcDTO.setZwrq( entity.getZwrq() );
        }
        if ( entity.getCfyxjsrq2() != null ) {
            pcmGbhmcDTO.setCfyxjsrq2( entity.getCfyxjsrq2() );
        }
        if ( entity.getPostexpiration2() != null ) {
            pcmGbhmcDTO.setPostexpiration2( entity.getPostexpiration2() );
        }
        if ( entity.getKhcjtx2() != null ) {
            pcmGbhmcDTO.setKhcjtx2( entity.getKhcjtx2() );
        }
        if ( entity.getZjnx2() != null ) {
            pcmGbhmcDTO.setZjnx2( entity.getZjnx2() );
        }
        if ( entity.getHqxlbyyx2() != null ) {
            pcmGbhmcDTO.setHqxlbyyx2( entity.getHqxlbyyx2() );
        }
        if ( entity.getRank() != null ) {
            pcmGbhmcDTO.setRank( entity.getRank() );
        }
        if ( entity.getGw() != null ) {
            pcmGbhmcDTO.setGw( entity.getGw() );
        }
        if ( entity.getZjhm() != null ) {
            pcmGbhmcDTO.setZjhm( entity.getZjhm() );
        }
        if ( entity.getOrmorgsectorname() != null ) {
            pcmGbhmcDTO.setOrmorgsectorname( entity.getOrmorgsectorname() );
        }
        if ( entity.getJzrz2() != null ) {
            pcmGbhmcDTO.setJzrz2( entity.getJzrz2() );
        }
        if ( entity.getRznldqColor() != null ) {
            pcmGbhmcDTO.setRznldqColor( entity.getRznldqColor() );
        }
        if ( entity.getZw() != null ) {
            pcmGbhmcDTO.setZw( entity.getZw() );
        }
        if ( entity.getKhcj() != null ) {
            pcmGbhmcDTO.setKhcj( entity.getKhcj() );
        }
        if ( entity.getDacsrq() != null ) {
            pcmGbhmcDTO.setDacsrq( entity.getDacsrq() );
        }
        if ( entity.getZzdzs() != null ) {
            pcmGbhmcDTO.setZzdzs( entity.getZzdzs() );
        }
        if ( entity.getXb() != null ) {
            pcmGbhmcDTO.setXb( entity.getXb() );
        }
        if ( entity.getLgnx2Color() != null ) {
            pcmGbhmcDTO.setLgnx2Color( entity.getLgnx2Color() );
        }
        if ( entity.getHqxlsxzy2() != null ) {
            pcmGbhmcDTO.setHqxlsxzy2( entity.getHqxlsxzy2() );
        }
        if ( entity.getDacjgzsj() != null ) {
            pcmGbhmcDTO.setDacjgzsj( entity.getDacjgzsj() );
        }
        if ( entity.getRdsj() != null ) {
            pcmGbhmcDTO.setRdsj( entity.getRdsj() );
        }
        if ( entity.getLgkssj2() != null ) {
            pcmGbhmcDTO.setLgkssj2( entity.getLgkssj2() );
        }
        if ( entity.getSyczjrq2() != null ) {
            pcmGbhmcDTO.setSyczjrq2( entity.getSyczjrq2() );
        }
        if ( entity.getJg() != null ) {
            pcmGbhmcDTO.setJg( entity.getJg() );
        }
        if ( entity.getKhcjtx() != null ) {
            pcmGbhmcDTO.setKhcjtx( entity.getKhcjtx() );
        }
        if ( entity.getJlczz() != null ) {
            pcmGbhmcDTO.setJlczz( entity.getJlczz() );
        }
        if ( entity.getPimpersonid() != null ) {
            pcmGbhmcDTO.setPimpersonid( entity.getPimpersonid() );
        }
        if ( entity.getRznx() != null ) {
            pcmGbhmcDTO.setRznx( entity.getRznx() );
        }
        if ( entity.getRznx2() != null ) {
            pcmGbhmcDTO.setRznx2( entity.getRznx2() );
        }
        if ( entity.getOrgtype() != null ) {
            pcmGbhmcDTO.setOrgtype( entity.getOrgtype() );
        }
        if ( entity.getRtsj() != null ) {
            pcmGbhmcDTO.setRtsj( entity.getRtsj() );
        }
        if ( entity.getZzmm() != null ) {
            pcmGbhmcDTO.setZzmm( entity.getZzmm() );
        }
        if ( entity.getFirsteducation() != null ) {
            pcmGbhmcDTO.setFirsteducation( entity.getFirsteducation() );
        }
        if ( entity.getDzjbjsj() != null ) {
            pcmGbhmcDTO.setDzjbjsj( entity.getDzjbjsj() );
        }
        if ( entity.getYgbh() != null ) {
            pcmGbhmcDTO.setYgbh( entity.getYgbh() );
        }
        if ( entity.getNl() != null ) {
            pcmGbhmcDTO.setNl( entity.getNl() );
        }
        if ( entity.getZwnx2() != null ) {
            pcmGbhmcDTO.setZwnx2( entity.getZwnx2() );
        }
        if ( entity.getDyxlbysj2() != null ) {
            pcmGbhmcDTO.setDyxlbysj2( entity.getDyxlbysj2() );
        }
        if ( entity.getOrmorgsectorid() != null ) {
            pcmGbhmcDTO.setOrmorgsectorid( entity.getOrmorgsectorid() );
        }
        if ( entity.getOrmorgid() != null ) {
            pcmGbhmcDTO.setOrmorgid( entity.getOrmorgid() );
        }
        if ( entity.getOrmorgname() != null ) {
            pcmGbhmcDTO.setOrmorgname( entity.getOrmorgname() );
        }
        if ( entity.getSyczjrq() != null ) {
            pcmGbhmcDTO.setSyczjrq( entity.getSyczjrq() );
        }
        if ( entity.getCjgzsj() != null ) {
            pcmGbhmcDTO.setCjgzsj( entity.getCjgzsj() );
        }
        if ( entity.getSgjsrq2() != null ) {
            pcmGbhmcDTO.setSgjsrq2( entity.getSgjsrq2() );
        }
        if ( entity.getYgzt() != null ) {
            pcmGbhmcDTO.setYgzt( entity.getYgzt() );
        }
        if ( entity.getCsrq() != null ) {
            pcmGbhmcDTO.setCsrq( entity.getCsrq() );
        }
        if ( entity.getDyxlbyyx2() != null ) {
            pcmGbhmcDTO.setDyxlbyyx2( entity.getDyxlbyyx2() );
        }
        if ( entity.getZgcode() != null ) {
            pcmGbhmcDTO.setZgcode( entity.getZgcode() );
        }
        if ( entity.getOrgid() != null ) {
            pcmGbhmcDTO.setOrgid( entity.getOrgid() );
        }

        return pcmGbhmcDTO;
    }

    @Override
    public List<PcmGbhmc> toDomain(List<PcmGbhmcDTO> dtoList) {
        if ( dtoList == null ) {
            return null;
        }

        List<PcmGbhmc> list = new ArrayList<PcmGbhmc>( dtoList.size() );
        for ( PcmGbhmcDTO pcmGbhmcDTO : dtoList ) {
            list.add( toDomain( pcmGbhmcDTO ) );
        }

        return list;
    }

    @Override
    public List<PcmGbhmcDTO> toDto(List<PcmGbhmc> entityList) {
        if ( entityList == null ) {
            return null;
        }

        List<PcmGbhmcDTO> list = new ArrayList<PcmGbhmcDTO>( entityList.size() );
        for ( PcmGbhmc pcmGbhmc : entityList ) {
            list.add( toDto( pcmGbhmc ) );
        }

        return list;
    }
}
